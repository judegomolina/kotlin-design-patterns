package behavioral.chainOfResponsibility.kotlinesque

import behavioral.chainOfResponsibility.traditional.handler.isJuniorDeveloper
import behavioral.chainOfResponsibility.traditional.handler.isKnownEmail
import java.security.InvalidParameterException

typealias Handler = (request: Request) -> Response

object Handlers {

    private val basicValidationHandler = fun(nextHandler: Handler) =
        fun(request: Request): Response {
            if (request.email.isEmpty() || request.question.isEmpty())
                throw IllegalArgumentException()

            return nextHandler(request)
        }

    private val authenticationHandler = fun(nextHandler: Handler) =
        fun(request: Request): Response {
            if (!request.email.isKnownEmail())
                throw InvalidParameterException()

            return nextHandler(request)
        }

    private val authorizationHandler = fun(nextHandler: Handler) =
        fun(request: Request): Response {
            if (request.email.isJuniorDeveloper())
                throw InvalidParameterException()

            return nextHandler(request)
        }

    private val actualRequestHandler =
        fun(request: Request): Response {
            return Response("idk, check StackOverflow?")
        }

    fun getRequestHandlingChain() =
        basicValidationHandler(
            authenticationHandler(
                authorizationHandler(
                    actualRequestHandler
                )
            )
        )
}
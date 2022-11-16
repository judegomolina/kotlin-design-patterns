package behavioral.chainOfResponsibility.traditional.handler

import behavioral.chainOfResponsibility.traditional.Request
import behavioral.chainOfResponsibility.traditional.Response
import java.security.InvalidParameterException
import kotlin.random.Random

class AuthenticationHandler(
    private val nextHandler: Handler
) : Handler {

    override fun handle(request: Request): Response {
        if (!request.email.isKnownEmail())
            throw InvalidParameterException()

        return nextHandler.handle(request)
    }
}

fun String.isKnownEmail() = true

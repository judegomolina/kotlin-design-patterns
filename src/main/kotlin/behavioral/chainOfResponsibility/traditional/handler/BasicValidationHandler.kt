package behavioral.chainOfResponsibility.traditional.handler

import behavioral.chainOfResponsibility.traditional.Request
import behavioral.chainOfResponsibility.traditional.Response

class BasicValidationHandler(
    private val nextHandler: Handler
) : Handler {

    override fun handle(request: Request): Response {
        if (request.email.isEmpty() || request.question.isEmpty())
            throw IllegalArgumentException()

        return nextHandler.handle(request)
    }
}

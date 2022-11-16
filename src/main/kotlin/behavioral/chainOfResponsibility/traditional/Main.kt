package behavioral.chainOfResponsibility.traditional

import behavioral.chainOfResponsibility.traditional.handler.ActualRequestHandler
import behavioral.chainOfResponsibility.traditional.handler.AuthenticationHandler
import behavioral.chainOfResponsibility.traditional.handler.AuthorizationHandler
import behavioral.chainOfResponsibility.traditional.handler.BasicValidationHandler

fun main() {
    val request = Request(
        email = "me@me.com",
        question = "help!!"
    )

    val requestProcessingChain = BasicValidationHandler(
        AuthenticationHandler(
            AuthorizationHandler(
                ActualRequestHandler()
            )
        )
    )

    print(requestProcessingChain.handle(request))
}

package behavioral.chainOfResponsibility.traditional.handler

import behavioral.chainOfResponsibility.traditional.Request
import behavioral.chainOfResponsibility.traditional.Response

class ActualRequestHandler : Handler {

    override fun handle(request: Request): Response {
        return Response("idk, check StackOverflow")
    }
}

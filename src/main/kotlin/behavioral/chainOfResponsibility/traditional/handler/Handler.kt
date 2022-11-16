package behavioral.chainOfResponsibility.traditional.handler

import behavioral.chainOfResponsibility.traditional.Request
import behavioral.chainOfResponsibility.traditional.Response

interface Handler {

    fun handle(request: Request): Response
}

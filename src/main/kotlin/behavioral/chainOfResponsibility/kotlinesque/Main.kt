package behavioral.chainOfResponsibility.kotlinesque

fun main() {
    val request = Request(
        email = "me@me.com",
        question = "help!!"
    )

    val requestHandlingChain = Handlers.getRequestHandlingChain()

    print(requestHandlingChain(request))
}

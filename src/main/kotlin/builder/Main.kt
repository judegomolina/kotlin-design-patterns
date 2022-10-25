package builder

fun main() {
    val exampleEmailOne = Email(message = "Message 1")
        .setTitle("Sample Title 1")
        .addReceiver("example@example.com")
        .addCcAddress("cc-example@example.com")
        .addBccAddress("bcc-example@example.com")

    println(exampleEmailOne)

    val exampleEmailTwo = Email(message = "Message 2")
        .setTitle("Sample Title 2")
        .addReceivers(listOf("example1@example.com", "example2@example.com"))
        .addCcAddresses(listOf("cc-example1@example.com", "cc-example2@example.com"))
        .addBccAddresses(listOf("bcc-example1@example.com", "bcc-example2@example.com"))

    println(exampleEmailTwo)
}
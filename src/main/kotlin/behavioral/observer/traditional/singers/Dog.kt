package behavioral.observer.traditional.singers

class Dog: Singer {

    fun bark() { println("Woof") }

    fun howl() { println("Auuuu") }

    override fun sing() {
        bark()
        howl()
    }
}

package behavioral.observer.traditional.singers

class Bat: Singer {

    fun screech() { println("Eeeeee") }

    override fun sing() { screech() }
}

package behavioral.observer.traditional.singers

class Turkey: Singer {

    fun gobble() { println("Gob-gob") }

    override fun sing() { gobble() }
}

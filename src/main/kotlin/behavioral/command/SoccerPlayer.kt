package behavioral.command

typealias Command = ()->Unit

class SoccerPlayer {
    private val commands = mutableListOf<Command>()

    fun move(x: Int, y: Int) {
        println("Moved to ($x, $y)")
    }

    fun addMove(x: Int, y: Int): SoccerPlayer {
        commands.add(
            Generators.moveGenerator(this, x, y)
        )
        return this
    }

    fun execute() {
        while (commands.isNotEmpty()) {
            val action = commands.removeAt(0)
            action.invoke()
        }
    }
}

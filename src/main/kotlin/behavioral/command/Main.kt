package behavioral.command

fun main() {
    val player = SoccerPlayer()
    player.addMove(10, 10)
        .addMove(20, 20)
        .addMove(90, 10)

    player.execute()
}

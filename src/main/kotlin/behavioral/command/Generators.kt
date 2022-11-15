package behavioral.command

object Generators {

    val moveGenerator = fun(
        player: SoccerPlayer,
        x: Int,
        y: Int
    ) = fun() {
           player.move(x, y)
       }
}

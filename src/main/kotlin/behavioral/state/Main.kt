package behavioral.state

import behavioral.state.monster.Monster

fun main() {
    val monster = Monster()
    println(monster.checkMood())
    monster.seeHero()
    println(monster.checkMood())
    monster.getHit(5)
    println(monster.checkMood())
}

package behavioral.strategy.traditional

import behavioral.strategy.traditional.weapon.BareHands
import behavioral.strategy.traditional.weapon.Sword

fun main() {
    val warrior = Warrior()
    warrior.attack()
    warrior.changeWeapon(Sword())
    warrior.attack()
}

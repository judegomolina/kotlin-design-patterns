package behavioral.strategy.kotlinesque

import behavioral.strategy.kotlinesque.Warrior


fun main() {
    val warrior = Warrior()
    warrior.attack()
    warrior.changeWeapon(Weapons.gun)
    warrior.attack()
}

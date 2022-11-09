package behavioral.strategy.kotlinesque



fun main() {
    val warrior = Warrior()
    warrior.attack()
    warrior.changeWeapon(Weapons.gun)
    warrior.attack()
}

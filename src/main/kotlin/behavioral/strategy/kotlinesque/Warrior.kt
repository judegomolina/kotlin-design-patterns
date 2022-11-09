package behavioral.strategy.kotlinesque

class Warrior(
    private var currentWeapon: ()->Unit = Weapons.bareHands
) {

    fun attack() = currentWeapon()

    fun changeWeapon(newWeapon: ()->Unit) {
        currentWeapon = newWeapon
    }

}

package behavioral.strategy.traditional

import behavioral.strategy.traditional.weapon.BareHands
import behavioral.strategy.traditional.weapon.Weapon

class Warrior(
    private var currentWeapon: Weapon = BareHands()
) {
    fun attack() = currentWeapon.attack()

    fun changeWeapon(newWeapon: Weapon) {
        currentWeapon = newWeapon
    }
}

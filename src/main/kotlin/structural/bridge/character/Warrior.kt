package structural.bridge.character

import structural.bridge.weapon.Weapon

const val WARRIOR_BASE_SPEED: KmH = 20F

class Warrior(
    override val weapon: Weapon
): Character {
    override val baseSpeed: KmH = WARRIOR_BASE_SPEED
}
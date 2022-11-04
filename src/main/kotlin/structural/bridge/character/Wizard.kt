package structural.bridge.character

import structural.bridge.weapon.Weapon

const val WIZARD_BASE_SPEED: KmH = 20F

class Wizard(
    override val weapon: Weapon
): Character {
    override val baseSpeed: KmH = WIZARD_BASE_SPEED
}

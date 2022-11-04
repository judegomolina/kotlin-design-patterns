package structural.bridge.weapon

const val SWORD_POINTS_OF_DAMAGE = 10L
const val SWORD_WEIGHT: Kilos = 5

class Sword : Weapon {
    override val weight: Kilos = SWORD_WEIGHT

    override fun attack() = SWORD_POINTS_OF_DAMAGE
}
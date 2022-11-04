package structural.bridge.weapon

const val DAGGER_POINTS_OF_DAMAGE = 2L
const val DAGGER_WEIGHT: Kilos = 1

class Dagger : Weapon {
    override val weight: Kilos = DAGGER_WEIGHT

    override fun attack(): PointsOfDamage = DAGGER_POINTS_OF_DAMAGE
}
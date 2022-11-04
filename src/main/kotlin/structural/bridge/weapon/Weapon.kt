package structural.bridge.weapon

typealias PointsOfDamage = Long
typealias Kilos = Int

interface Weapon {
    val weight: Kilos

    fun attack(): PointsOfDamage
}
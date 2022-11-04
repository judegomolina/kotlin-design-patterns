package structural.bridge.character

import structural.bridge.weapon.Weapon

typealias Meters = Float
typealias KmH = Float

const val METERS_TO_KILOMETERS = 1000
const val HOURS_TO_SECONDS = 3600

interface Character {
    val weapon: Weapon
    val baseSpeed: KmH

    fun attack(target: String) {
        val damage = weapon.attack()
        println("Inflicted $damage points of damage to $target!")
    }

    fun move(direction: Direction, distance: Meters) {
        val adjustedSpeed = baseSpeed / (1 + weapon.weight)
        val timeElapsed = (distance / METERS_TO_KILOMETERS) / adjustedSpeed * HOURS_TO_SECONDS
        println("I moved $distance meters in $timeElapsed seconds in the direction $direction")
    }
}
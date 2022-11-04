package structural.bridge

import structural.bridge.character.Direction
import structural.bridge.character.Warrior
import structural.bridge.character.Wizard
import structural.bridge.weapon.Dagger
import structural.bridge.weapon.Sword

fun main() {
    val wizardWithSword = Wizard(weapon = Sword())
    wizardWithSword.move(direction = Direction.FORWARD, distance = 10F)
    wizardWithSword.attack("Monster")

    val warriorWithSword = Warrior(weapon = Sword())
    warriorWithSword.move(direction = Direction.LEFT, distance = 20F)
    warriorWithSword.attack("Ugly monster")

    val warriorWithDagger = Warrior(weapon = Dagger())
    warriorWithDagger.move(direction = Direction.RIGHT, distance = 20F)
    warriorWithDagger.attack("Not that ugly monster")

    val wizardWithDagger = Wizard(weapon = Dagger())
    wizardWithDagger.move(direction = Direction.BACKWARDS, distance = 5F)
    wizardWithDagger.attack("FINAL BOSS!!!")
}

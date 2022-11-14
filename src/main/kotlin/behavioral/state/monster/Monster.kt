package behavioral.state.monster

import behavioral.state.monster.mood.Aggressive
import behavioral.state.monster.mood.Dead
import behavioral.state.monster.mood.Mood
import behavioral.state.monster.mood.Retreating
import behavioral.state.monster.mood.Still

const val MONSTER_HEALTH_POINTS : Int = 10

class Monster : MonsterActions {
    private var healthPoints = MONSTER_HEALTH_POINTS
    private var mood: Mood = Still()

    override fun seeHero() {
        mood = when (mood) {
            is Still -> Aggressive()
            else -> mood
        }
    }

    override fun getHit(pointsOfDamage: Int) {
        healthPoints -= pointsOfDamage
        mood = when {
            (healthPoints <= 0) -> Dead()
            mood is Aggressive -> Retreating()
            else -> mood
        }
    }

    override fun calmAgain() {
        healthPoints += 3
        healthPoints = maxOf(healthPoints, MONSTER_HEALTH_POINTS)
        mood = when {
            (healthPoints == MONSTER_HEALTH_POINTS) -> Still()
            else -> mood
        }
    }

    fun checkMood() = mood

}
package structural.composite.teamMembers

import structural.composite.common.CanCalculateItsCost
import java.math.BigDecimal

const val MONTHS_IN_YEAR = 12

class Player(
    val name: String,
    val skillLevel: Int,
    private val yearlySalary: BigDecimal
) : CanCalculateItsCost {

    override fun calculateCost() = yearlySalary / MONTHS_IN_YEAR.toBigDecimal()
}

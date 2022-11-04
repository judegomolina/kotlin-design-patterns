package structural.composite.teamMembers

import structural.composite.common.CanCalculateItsCost
import java.math.BigDecimal

class TechnicalMember(
    private val workingHoursPerMonth: Int,
    private val hourlySalary: BigDecimal
) : CanCalculateItsCost {

    override fun calculateCost() = workingHoursPerMonth.toBigDecimal() * hourlySalary
}

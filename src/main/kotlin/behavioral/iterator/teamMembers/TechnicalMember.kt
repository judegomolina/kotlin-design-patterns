package behavioral.iterator.teamMembers

import behavioral.iterator.common.TeamMember
import structural.composite.common.CanCalculateItsCost
import java.math.BigDecimal

class TechnicalMember(
    val workingHoursPerMonth: Int,
    val hourlySalary: BigDecimal
) : TeamMember

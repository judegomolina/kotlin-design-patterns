package behavioral.iterator.teamMembers

import behavioral.iterator.common.TeamMember
import java.math.BigDecimal

const val MONTHS_IN_YEAR = 12

class Player(
    val name: String,
    val skillLevel: Int,
    val yearlySalary: BigDecimal
) : TeamMember

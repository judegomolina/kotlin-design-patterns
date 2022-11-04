package structural.composite

import structural.composite.common.CanCalculateItsCost
import structural.composite.teamMembers.Player
import java.math.BigDecimal

class Team(
    val members: MutableList<CanCalculateItsCost> = mutableListOf()
) : CanCalculateItsCost{

    constructor(vararg initialMembers: CanCalculateItsCost) : this(mutableListOf()) {
        for (member in initialMembers) {
            this.members.add(member)
        }
    }

    override fun calculateCost(): BigDecimal {
        var totalCost = BigDecimal.ZERO
        for (member in members) {
            totalCost += member.calculateCost()
        }
        return totalCost
    }
}

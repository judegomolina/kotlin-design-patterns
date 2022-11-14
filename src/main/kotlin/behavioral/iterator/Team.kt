package behavioral.iterator

import behavioral.iterator.common.TeamMember

class Team(
    val members: MutableList<TeamMember> = mutableListOf()
) : TeamMember {

    constructor(vararg initialMembers: TeamMember) : this(mutableListOf()) {
        for (member in initialMembers) {
            this.members.add(member)
        }
    }

    operator fun iterator() = object : Iterator<TeamMember> {
        var i = 0

        override fun hasNext(): Boolean {
            return i < members.size
        }

        override fun next(): TeamMember {
            return members[i].also { i++ }
        }
    }
}

package behavioral.observer.traditional

import behavioral.observer.traditional.singers.Singer

class Cat {
    private var participants = mutableSetOf<Singer>()

    fun joinChoir(participant: Singer): Cat {
        participants.add(participant)
        return this
    }

    fun leaveChoir(participant: Singer): Cat {
        participants.remove(participant)
        return this
    }

    fun conduct() {
        for (participant in participants) participant.sing()
    }
}

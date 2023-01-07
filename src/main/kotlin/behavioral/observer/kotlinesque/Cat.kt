package behavioral.observer.kotlinesque

class Cat {
    private var participants = mutableSetOf<()->Unit>()

    fun joinChoir(whatToCall: ()->Unit): Cat {
        participants.add(whatToCall)
        return this
    }

    fun leaveChoir(whatToCall: () -> Unit): Cat {
        participants.remove(whatToCall)
        return this
    }

    fun conduct() {
        for (participant in participants) participant()
    }
}

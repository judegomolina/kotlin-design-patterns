package structural.adapter.classBased.controllaberPerson

class ControllableSpanishSpeaker(
    private var controlled: Boolean = false
) : ControllablePerson {

    override fun startControl(controlKeyword: String) {
        if (controlKeyword == "Papa") {
            controlled = true
        }
    }

    override fun isControlled(): Boolean = controlled
}

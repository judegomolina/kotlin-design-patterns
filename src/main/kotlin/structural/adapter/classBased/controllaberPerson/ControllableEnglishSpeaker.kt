package structural.adapter.classBased.controllaberPerson

class ControllableEnglishSpeaker(
    private var controlled: Boolean = false
) : ControllablePerson {

    override fun startControl(controlKeyword: String) {
        if (controlKeyword == "Potato") {
            controlled = true
        }
    }

    override fun isControlled(): Boolean = controlled
}
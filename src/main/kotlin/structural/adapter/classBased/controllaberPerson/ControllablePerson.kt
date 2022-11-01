package structural.adapter.classBased.controllaberPerson

interface ControllablePerson {

    fun startControl(controlKeyword: String)

    fun isControlled(): Boolean
}
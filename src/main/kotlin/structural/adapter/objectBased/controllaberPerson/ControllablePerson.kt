package structural.adapter.objectBased.controllaberPerson

interface ControllablePerson {

    fun startControl(controlKeyword: String)

    fun isControlled(): Boolean
}
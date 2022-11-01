package structural.adapter.classBased

import structural.adapter.classBased.controllaberPerson.ControllableEnglishSpeaker
import structural.adapter.classBased.controllaberPerson.ControllableSpanishSpeaker
import structural.adapter.classBased.eviloverLord.EvilOverlord
import structural.adapter.classBased.eviloverLord.EvilOverlordSpanishAdapter

fun main() {
    val evilOverlord = EvilOverlord()
    val englishSpeaker = ControllableEnglishSpeaker()

    val controlKeyword = evilOverlord.sayControlKeyword()
    println("Control Keyword: $controlKeyword")
    englishSpeaker.startControl(controlKeyword)
    println("Is english speaker controlled? ${englishSpeaker.isControlled()}")

    val spanishSpeaker = ControllableSpanishSpeaker()
    spanishSpeaker.startControl(controlKeyword)
    println("Is spanish speaker controlled? ${spanishSpeaker.isControlled()}")

    val spanishAdapter = EvilOverlordSpanishAdapter()
    val spanishControlKeyword = spanishAdapter.sayControlKeyword()
    println("Spanish Control Keyword: $spanishControlKeyword")
    spanishSpeaker.startControl(spanishControlKeyword)
    println("Is spanish speaker controlled? ${spanishSpeaker.isControlled()}")
}

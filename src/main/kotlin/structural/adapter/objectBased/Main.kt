package structural.adapter.objectBased

import structural.adapter.objectBased.controllaberPerson.ControllableEnglishSpeaker
import structural.adapter.objectBased.controllaberPerson.ControllableSpanishSpeaker
import structural.adapter.objectBased.eviloverLord.EvilOverlord
import structural.adapter.objectBased.eviloverLord.EvilOverlordSpanishAdapter

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

    val spanishAdapter = EvilOverlordSpanishAdapter(evilOverlord)
    val spanishControlKeyword = spanishAdapter.sayControlKeyword()
    println("Spanish Control Keyword: $spanishControlKeyword")
    spanishSpeaker.startControl(spanishControlKeyword)
    println("Is spanish speaker controlled? ${spanishSpeaker.isControlled()}")
}

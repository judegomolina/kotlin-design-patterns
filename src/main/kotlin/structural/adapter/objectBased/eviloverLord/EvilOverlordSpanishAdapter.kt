package structural.adapter.objectBased.eviloverLord

class EvilOverlordSpanishAdapter(
    private val evilOverlord: EvilOverlord
): Controller {

    override fun sayControlKeyword(): String {
        val englishKeyword = evilOverlord.sayControlKeyword()
        return translateToSpanish(englishKeyword)
    }

    private fun translateToSpanish(word: String) =
        if (word == "Potato") "Papa"
        else "Sorry I don't know"
}
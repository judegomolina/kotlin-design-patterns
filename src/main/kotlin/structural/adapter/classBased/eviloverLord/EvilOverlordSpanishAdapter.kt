package structural.adapter.classBased.eviloverLord

class EvilOverlordSpanishAdapter : EvilOverlord() {

    override fun sayControlKeyword(): String {
        val englishKeyword = super.sayControlKeyword()
        return translateToSpanish(englishKeyword)
    }

    private fun translateToSpanish(word: String) =
        if (word == "Potato") "Papa"
        else "Sorry I don't know"
}
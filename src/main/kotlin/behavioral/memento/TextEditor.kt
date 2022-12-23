package behavioral.memento

class TextEditor(
    private var text: String = ""
) {

    private val previousState = PreviousState()


    fun addText(newText: String) {
        previousState.captureText(text)
        text += newText
        println(text)
    }

    fun revert() {
        text = previousState.getPreviousText()
        println(text)
    }

    inner class PreviousState(private var previousText: String = "") {

        fun captureText(text: String) {
            previousText = text
        }

        fun getPreviousText() = previousText
    }
}

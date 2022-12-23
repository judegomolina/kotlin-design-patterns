package behavioral.memento

fun main() {
    val editor = TextEditor()
    editor.addText("First line \n")
    editor.addText("Second line \n")
    editor.revert()
}

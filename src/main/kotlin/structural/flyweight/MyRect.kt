package structural.flyweight

import java.awt.Color
import java.awt.Graphics

class MyRect(
    private val color: Color
) {

    fun draw(graphics: Graphics, x1: Int, y1: Int, x2: Int, y2: Int) {
        graphics.color = this.color
        graphics.fillRect(x1, y1, x2, y2)
    }
}

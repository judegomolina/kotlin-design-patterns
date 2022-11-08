package structural.flyweight

import java.awt.Color

object RectFactory {

    private val rectanglesByColor: HashMap<Color, MyRect> = HashMap()

    fun getRectangle(color: Color) = rectanglesByColor[color] ?: MyRect(color)
}
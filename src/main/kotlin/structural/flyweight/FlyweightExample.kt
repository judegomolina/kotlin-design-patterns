package structural.flyweight

import java.awt.BorderLayout
import java.awt.Color
import java.awt.Graphics
import java.awt.event.ActionListener
import java.time.LocalDateTime
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.random.Random

class FlyweightExample(
    windowWidth: Int = 1750,
    windowHeight: Int = 1500
): JFrame() {

    private val colors = listOf(
        Color.orange,
        Color.red,
        Color.blue,
        Color.black
    )

    init {
        setSize(windowWidth, windowHeight)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Flyweight Test"

        val contentPanel = JPanel()
        contentPanel.layout = BorderLayout()

        val drawingPanel = JPanel()

        val startDrawingButton = JButton("Start Drawing")

        contentPanel.add(drawingPanel, BorderLayout.CENTER)
        contentPanel.add(startDrawingButton, BorderLayout.SOUTH)

        startDrawingButton.addActionListener(
            ActionListener {
                val graphics: Graphics = drawingPanel.graphics

                val startTime = LocalDateTime.now()
                for (i in 1..2) {
                    val rect = RectFactory.getRectangle(randomColor)
                    rect.draw(
                        graphics = graphics,
                        x1 = randomX,
                        y1 = randomY,
                        x2 = randomX,
                        y2 = randomY
                    )
                }

                val endTime = LocalDateTime.now()
                println("That took ${endTime.compareTo(startTime)}")
            }
        )

        add(contentPanel)
        isVisible = true
    }

    private val randomColor: Color
            get() {
                val randomIndex = Random.nextInt(colors.size)
                return colors[randomIndex]
            }

    private val randomX = (0 .. windowWidth).random()

    private val randomY = (0 .. windowHeight).random()
}

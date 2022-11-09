package structural.proxy

import java.io.File

object ImageLoader {
    private var loads: Int = 0

    fun getCatImage() = File("cat_small_cat_cats_eye.jpg").also {
        println("I am loading a heavy cat image")
        loads += 1
    }

    fun getLoads() = loads
}
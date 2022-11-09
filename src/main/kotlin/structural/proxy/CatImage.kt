package structural.proxy

import java.io.File

class CatImage {
    private var loads: Int = 0

    val image: File by lazy {
        File("cat_small_cat_cats_eye.jpg").also {
            loads += 1
        }
    }

    fun getLoads() = loads

}

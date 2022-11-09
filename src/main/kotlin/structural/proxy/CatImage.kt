package structural.proxy

import java.io.File

class CatImage {

    val image: File by lazy { ImageLoader.getCatImage() }

}

package structural.proxy

fun main() {
    val catImage = CatImage()
    for (i in 0..10) {
        catImage.image
    }
    println(catImage.getLoads())
}

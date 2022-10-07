package staticFactoryMethod

fun main() {
    val toyotaCar = Car.createToyota()
    println(toyotaCar.brand)
}

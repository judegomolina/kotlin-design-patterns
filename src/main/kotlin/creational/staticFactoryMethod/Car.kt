package creational.staticFactoryMethod

class Car private constructor(
    val brand: String
) {

    companion object {

        fun createToyota() = Car(
            brand = "Toyota"
        )
    }
}

package creational.factoryMethod.meal

interface Meal {
    val id: Long
    val name: String
    abstract fun greet()
}

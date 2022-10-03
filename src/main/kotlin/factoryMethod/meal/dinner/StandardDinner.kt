package factoryMethod.meal.dinner

class StandardDinner(
    override val id: Long,
    override val name: String
): Dinner {
    override fun greet() {
        println("I am a standard dinner")
    }
}

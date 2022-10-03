package factoryMethod.meal.breakfast

class VeganBreakfast(
    override val id: Long,
    override val name: String
): Breakfast {
    override fun greet() {
        println("I am a vegan breakfast")
    }
}

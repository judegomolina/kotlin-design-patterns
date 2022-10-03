package factoryMethod.meal.breakfast

class StandardBreakfast(
    override val id: Long,
    override val name: String
): Breakfast {
    override fun greet() {
        println("I am a standard breakfast")
    }
}

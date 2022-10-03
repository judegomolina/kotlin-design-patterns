package factoryMethod.meal.lunch

class VeganLunch(
    override val id: Long,
    override val name: String
): Lunch {
    override fun greet() {
        println("I am a vegan lunch")
    }
}

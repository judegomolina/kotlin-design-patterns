package factoryMethod.meal.lunch

class StandardLunch(
    override val id: Long,
    override val name: String
): Lunch {
    override fun greet() {
        println("I am a standard lunch")
    }
}

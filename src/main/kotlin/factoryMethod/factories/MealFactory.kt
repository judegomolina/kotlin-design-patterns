package factoryMethod.factories

object MealFactory {
    private var idCounter: Long = 0

    fun getMeal(mealType: String, name: String, mealSubtype: String) = when(mealType.trim().lowercase()) {
        "breakfast" -> BreakfastFactory.getBreakfast(id = ++idCounter, name  = name, type = mealSubtype)
        "lunch" -> LunchFactory.getLunch(id = ++idCounter, name  = name, type = mealSubtype)
        "dinner" -> DinnerFactory.getDinner(id = ++idCounter, name  = name, type = mealSubtype)
        else -> throw RuntimeException("Unknown meal of type: $mealType")
    }
}

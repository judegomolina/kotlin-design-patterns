package factoryMethod

import factoryMethod.factories.MealFactory

fun main() {
    val listOfMeals = listOf<Pair<String, String>>(
        "breakfast" to "vegan",
        "lunch" to "standard",
        "dinner" to "standard",
        "dinner" to "vegan"
    )

    for ((mealType, mealSubtype) in listOfMeals) {
        val meal = MealFactory.getMeal(
            mealType = mealType,
            mealSubtype = mealSubtype,
            name = "Example meal"
        )
        meal.greet()
    }
}
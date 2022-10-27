package creational.factoryMethod.factories

import creational.factoryMethod.meal.lunch.StandardLunch
import creational.factoryMethod.meal.lunch.VeganLunch

object LunchFactory {
    fun getLunch(id: Long, name: String,type: String) = when (type.trim().lowercase()) {
        "standard" -> StandardLunch(id, name)
        "vegan" -> VeganLunch(id, name)
        else -> throw RuntimeException("Unknown lunch type: $type")
    }
}
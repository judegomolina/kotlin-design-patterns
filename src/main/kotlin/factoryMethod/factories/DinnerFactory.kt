package factoryMethod.factories

import factoryMethod.meal.dinner.StandardDinner
import factoryMethod.meal.dinner.VeganDinner

object DinnerFactory {
    fun getDinner(id: Long, name: String,type: String) = when (type.trim().lowercase()) {
        "standard" -> StandardDinner(id, name)
        "vegan" -> VeganDinner(id, name)
        else -> throw RuntimeException("Unknown dinner type: $type")
    }
}

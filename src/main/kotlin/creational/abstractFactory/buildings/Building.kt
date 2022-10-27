package creational.abstractFactory.buildings

import creational.abstractFactory.units.BaseUnit

interface Building<in UnitType, out ProducedUnit>
    where UnitType: Enum<*>, ProducedUnit : BaseUnit {

        fun build(type: UnitType): ProducedUnit
}

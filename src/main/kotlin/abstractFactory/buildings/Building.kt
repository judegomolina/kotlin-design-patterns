package abstractFactory.buildings

import abstractFactory.units.BaseUnit

interface Building<in UnitType, out ProducedUnit>
    where UnitType: Enum<*>, ProducedUnit : BaseUnit {

        fun build(type: UnitType): ProducedUnit
}

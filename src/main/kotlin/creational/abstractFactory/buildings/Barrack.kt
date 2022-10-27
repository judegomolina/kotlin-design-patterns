package creational.abstractFactory.buildings

import creational.abstractFactory.units.infantry.Infantry
import creational.abstractFactory.units.infantry.InfantryUnits
import creational.abstractFactory.units.infantry.Rifleman
import creational.abstractFactory.units.infantry.RocketSoldier

class Barrack: Building<InfantryUnits, Infantry> {
    override fun build(type: InfantryUnits): Infantry {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}

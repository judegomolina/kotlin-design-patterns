package abstractFactory.buildings

import abstractFactory.units.infantry.Infantry
import abstractFactory.units.infantry.InfantryUnits
import abstractFactory.units.infantry.Rifleman
import abstractFactory.units.infantry.RocketSoldier

class Barrack: Building<InfantryUnits, Infantry> {
    override fun build(type: InfantryUnits): Infantry {
        return when (type) {
            InfantryUnits.RIFLEMAN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
        }
    }
}

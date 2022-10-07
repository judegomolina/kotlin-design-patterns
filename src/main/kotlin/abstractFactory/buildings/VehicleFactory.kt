package abstractFactory.buildings

import abstractFactory.units.vehicle.APC
import abstractFactory.units.vehicle.Tank
import abstractFactory.units.vehicle.Vehicle
import abstractFactory.units.vehicle.VehicleUnits

class VehicleFactory : Building<VehicleUnits, Vehicle> {
    override fun build(type: VehicleUnits): Vehicle {
        return when (type) {
            VehicleUnits.APC -> APC()
            VehicleUnits.TANK -> Tank()
        }
    }
}

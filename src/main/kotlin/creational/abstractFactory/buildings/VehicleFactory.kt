package creational.abstractFactory.buildings

import creational.abstractFactory.units.vehicle.APC
import creational.abstractFactory.units.vehicle.Tank
import creational.abstractFactory.units.vehicle.Vehicle
import creational.abstractFactory.units.vehicle.VehicleUnits

class VehicleFactory : Building<VehicleUnits, Vehicle> {
    override fun build(type: VehicleUnits): Vehicle {
        return when (type) {
            VehicleUnits.APC -> APC()
            VehicleUnits.TANK -> Tank()
        }
    }
}

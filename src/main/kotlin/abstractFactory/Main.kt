package abstractFactory

import abstractFactory.units.infantry.InfantryUnits
import abstractFactory.units.vehicle.VehicleUnits

fun main() {
    val hq = HQ()
    val barrack = hq.buildBarracks()
    val vehicleFactory = hq.buildVehicleFactory()

    val units = listOf(
        barrack.build(InfantryUnits.RIFLEMAN),
        barrack.build(InfantryUnits.ROCKET_SOLDIER),
        vehicleFactory.build(VehicleUnits.APC),
        vehicleFactory.build(VehicleUnits.TANK)
    )

    for (unit in units) {
        println(unit)
    }
}

package creational.abstractFactory

import creational.abstractFactory.units.infantry.InfantryUnits
import creational.abstractFactory.units.vehicle.VehicleUnits

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

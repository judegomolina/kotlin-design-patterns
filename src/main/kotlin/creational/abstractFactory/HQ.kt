package creational.abstractFactory

import creational.abstractFactory.buildings.Barrack
import creational.abstractFactory.buildings.Building
import creational.abstractFactory.buildings.VehicleFactory
import creational.abstractFactory.units.BaseUnit

class HQ {
    private val buildings = mutableListOf<Building<*, BaseUnit>>()

    fun buildBarracks(): Barrack {
        val barrack = Barrack()
        buildings.add(barrack)
        return barrack
    }

    fun buildVehicleFactory(): VehicleFactory {
        val vehicleFactory = VehicleFactory()
        buildings.add(vehicleFactory)
        return vehicleFactory
    }
}

package abstractFactory

import abstractFactory.buildings.Barrack
import abstractFactory.buildings.Building
import abstractFactory.buildings.VehicleFactory
import abstractFactory.units.BaseUnit

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

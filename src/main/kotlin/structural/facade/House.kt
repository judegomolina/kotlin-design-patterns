package structural.facade

import structural.facade.items.AirConditioning
import structural.facade.items.Laptop
import structural.facade.items.LightBulb

class House(
    val lightBulb: LightBulb = LightBulb(),
    val airConditioning: AirConditioning = AirConditioning(),
    val laptop: Laptop = Laptop()
) {

    fun setUpItems() {
        lightBulb.turnOn()
        airConditioning.turnOn()
        laptop.turnOn()
        laptop.connectToWifi()
    }
}
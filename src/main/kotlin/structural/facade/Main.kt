package structural.facade

fun main() {
    val house = House()
    house.setUpItems()

    println(house.lightBulb.isOn())
    println(house.airConditioning.isOn())
    println(house.laptop.isOn())
    println(house.laptop.isConnectedToWifi())
}

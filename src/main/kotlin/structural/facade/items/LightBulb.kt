package structural.facade.items

class LightBulb(
    private var on: Boolean = false
) {

    fun turnOn() {
        on = true
    }

    fun isOn() = on
}
package structural.facade.items

class AirConditioning(
    private var on: Boolean  = false
) {

    fun turnOn() {
        on = true
    }

    fun isOn() = on
}
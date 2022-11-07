package structural.facade.items

class Laptop (
    private var on: Boolean = false,
    private var connectedToWifi: Boolean = false
) {

    fun turnOn() {
        on = true
    }

    fun isOn() = on

    fun connectToWifi() {
        if (on) connectedToWifi = true
    }

    fun isConnectedToWifi() = connectedToWifi
}
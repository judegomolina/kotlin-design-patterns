package creational.singleton

object KotlinSingleton {
    private var accumulator = 0

    fun accumulate(value: Int): Int {
        accumulator += value
        return accumulator
    }
}

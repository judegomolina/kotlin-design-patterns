package creational.singleton

class TraditionalSingleton private constructor() {
    private var accumulator = 0

    companion object {
        @Volatile
        private lateinit var instance: TraditionalSingleton

        fun getInstance(): TraditionalSingleton {
            synchronized(this) {
                if (!Companion::instance.isInitialized) {
                    instance = TraditionalSingleton()
                }
                return instance
            }
        }
    }

    fun accumulate(value: Int): Int {
        accumulator += value
        return accumulator
    }

}
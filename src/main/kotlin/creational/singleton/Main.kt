package creational.singleton

fun main(args: Array<String>) {
    for (i in 1..10) {
        println("Kotlin Singleton: ${KotlinSingleton.accumulate(i)}")
        println("Traditional Singleton: ${TraditionalSingleton.getInstance().accumulate(i)}")
    }
}

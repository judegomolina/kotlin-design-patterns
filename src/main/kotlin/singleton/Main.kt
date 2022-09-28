package singleton

fun main(args: Array<String>) {
    println("Kotlin Singleton Example")
    kotlinSingletonExample()
}

fun kotlinSingletonExample() {
    for (i in 1..10) {
        println(KotlinSingleton.accumulate(i))
    }
}
package behavioral.observer.kotlinesque

import behavioral.observer.kotlinesque.singers.Bat
import behavioral.observer.kotlinesque.singers.Dog
import behavioral.observer.kotlinesque.singers.Turkey

fun main() {
    val catTheConductor = Cat()
    val dog = Dog()
    val turkey = Turkey()
    val bat = Bat()

    catTheConductor
        .joinChoir(dog::bark)
        .joinChoir(dog::howl)
        .joinChoir(turkey::gobble)
        .joinChoir(bat::screech)

    println("First conduction")
    catTheConductor.conduct()
    println()

    catTheConductor.leaveChoir(bat::screech)

    println("Second conduction")
    catTheConductor.conduct()
}

package behavioral.observer.traditional

import behavioral.observer.traditional.singers.Bat
import behavioral.observer.traditional.singers.Dog
import behavioral.observer.traditional.singers.Turkey

fun main() {
    val catTheConductor = Cat()
    val dog = Dog()
    val turkey = Turkey()
    val bat = Bat()

    catTheConductor
        .joinChoir(dog)
        .joinChoir(turkey)
        .joinChoir(bat)

    println("First conduction")
    catTheConductor.conduct()
    println()

    catTheConductor.leaveChoir(bat)

    println("Second conduction")
    catTheConductor.conduct()
}

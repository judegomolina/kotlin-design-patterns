package behavioral.strategy.kotlinesque

object Weapons {

    val bareHands = fun() { println("I am doing the best I can with my bare hands") }

    val sword = fun() { println("Attacking with a sword") }

    val gun = fun() { println("Shooting a gun") }

}
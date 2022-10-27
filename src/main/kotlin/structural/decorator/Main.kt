package structural.decorator

fun main() {
    println("Happy Map")
    var happyMap = HappyMap<String, String>()
    happyMap["Color"] = "Red"

    println("\nSad Map")
    var sadMap = SadMap<String, String>()
    sadMap["Color"] = "Red"
    sadMap.remove("Color")

    println("\nHappy Sad Map")
    var happySadMap = SadMap(HappyMap<String, String>())
    happySadMap["Color"] = "Red"
    happySadMap.remove("Color")

    println("\nSuper Sad Map")
    var superSadMap = SadMap(SadMap<String, String>())
    superSadMap["Color"] = "Red"
    superSadMap.remove("Color")

    println("\nTyping caveats")
    println(happySadMap is SadMap<*, *>) // true
    println(happySadMap is MutableMap<*, *>) // true
    println(happySadMap is HappyMap<*, *>) // true
}

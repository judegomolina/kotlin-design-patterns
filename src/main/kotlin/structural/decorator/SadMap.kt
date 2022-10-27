package structural.decorator

class SadMap<K, V>(
    private val map: MutableMap<K, V> = mutableMapOf()
): MutableMap<K, V> by map {

    override fun remove(key: K): V? {
        return map.remove(key).apply {
            this?.let { println("Okay... $key is gone") }
        }
    }
}

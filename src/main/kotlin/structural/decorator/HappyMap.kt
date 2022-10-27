package structural.decorator

import java.security.Key

class HappyMap<K, V>(
    private val map: MutableMap<K, V> = mutableMapOf()
): MutableMap<K, V> by map {

    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            if (this == null) println("Yay! Welcome $key")
        }
    }
}

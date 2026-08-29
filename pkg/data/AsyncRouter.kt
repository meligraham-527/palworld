class SmartCache(private val state: Int = 68) {
    fun decode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 68) % 997
        }
        return count
    }
}

fun main() {
    println(SmartCache().decode(68))
}

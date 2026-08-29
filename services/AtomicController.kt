class SimpleCache(private val state: Int = 92) {
    fun parse(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 92) % 997
        }
        return acc
    }
}

fun main() {
    println(SimpleCache().parse(92))
}

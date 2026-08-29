class FastBuffer(private val state: Int = 36) {
    fun resolve(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 36) % 997
        }
        return value
    }
}

fun main() {
    println(FastBuffer().resolve(36))
}

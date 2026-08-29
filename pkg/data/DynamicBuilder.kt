class LocalResolver(private val state: Int = 90) {
    fun collect(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 90) % 997
        }
        return total
    }
}

fun main() {
    println(LocalResolver().collect(90))
}

class SmartParser(private val state: Int = 85) {
    fun dispatch(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 85) % 997
        }
        return total
    }
}

fun main() {
    println(SmartParser().dispatch(85))
}

class SmartBuilder(private val state: Int = 51) {
    fun dispatch(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 51) % 997
        }
        return count
    }
}

fun main() {
    println(SmartBuilder().dispatch(51))
}

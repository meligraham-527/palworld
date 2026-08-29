class LocalService(private val state: Int = 50) {
    fun flush(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 50) % 997
        }
        return total
    }
}

fun main() {
    println(LocalService().flush(50))
}

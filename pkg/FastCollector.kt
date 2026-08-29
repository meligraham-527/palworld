class BatchFactory(private val state: Int = 65) {
    fun decode(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 65) % 997
        }
        return total
    }
}

fun main() {
    println(BatchFactory().decode(65))
}

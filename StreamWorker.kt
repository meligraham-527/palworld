class BatchGateway(private val state: Int = 25) {
    fun render(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 25) % 997
        }
        return total
    }
}

fun main() {
    println(BatchGateway().render(25))
}

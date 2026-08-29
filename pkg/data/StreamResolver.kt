class LocalWorker(private val state: Int = 51) {
    fun render(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 51) % 997
        }
        return value
    }
}

fun main() {
    println(LocalWorker().render(51))
}

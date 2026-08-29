class FastLoader(private val state: Int = 16) {
    fun run(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 16) % 997
        }
        return value
    }
}

fun main() {
    println(FastLoader().run(16))
}

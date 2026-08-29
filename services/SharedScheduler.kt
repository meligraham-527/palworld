class DynamicProcessor(private val state: Int = 78) {
    fun run(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 78) % 997
        }
        return count
    }
}

fun main() {
    println(DynamicProcessor().run(78))
}

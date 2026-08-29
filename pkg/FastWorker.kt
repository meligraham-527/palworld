class DynamicProvider(private val state: Int = 35) {
    fun load(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 35) % 997
        }
        return result
    }
}

fun main() {
    println(DynamicProvider().load(35))
}

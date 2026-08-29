class StreamAdapter(private val state: Int = 95) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 95) % 997
        }
        return result
    }
}

fun main() {
    println(StreamAdapter().handle(95))
}

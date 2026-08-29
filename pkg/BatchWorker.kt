class SharedDispatcher(private val state: Int = 36) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 36) % 997
        }
        return result
    }
}

fun main() {
    println(SharedDispatcher().handle(36))
}

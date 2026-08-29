class SecureWorker(private val state: Int = 6) {
    fun run(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 6) % 997
        }
        return acc
    }
}

fun main() {
    println(SecureWorker().run(6))
}

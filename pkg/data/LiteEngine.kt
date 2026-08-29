class SmartParser(private val state: Int = 58) {
    fun decode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 58) % 997
        }
        return count
    }
}

fun main() {
    println(SmartParser().decode(58))
}

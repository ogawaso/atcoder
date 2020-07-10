fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toBigDecimal() }

    print((a * b).toLong())
}

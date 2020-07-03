fun main() {
    val (a, b, x) = readLine()!!.split(" ").map { it.toLong() }
    println(b / x - (a + x - 1) / x + 1)
}


fun main() {
    val n = readLine()!!.toInt()
    var answer = 0L
    for (i in (1..n)) {
        answer += g(i, n)
    }

    println(answer)
}

fun g(x: Int, n: Int): Long {
    val y = (n / x).toLong()
    return  x * y * (y + 1) / 2
}

fun main() {
    val n = readLine()!!.toInt()

    var total = 1L
    for (i in (1..n)) {
        total = (total * i) % 1000000007
    }

    println(total)
}

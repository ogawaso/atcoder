fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
        .groupBy { it }.mapValues { it.value.size.toLong() }.toMutableMap()

    val q = readLine()!!.toInt()
    var total = a.map { it.key * it.value }.sum()
    for (i in 0 until q) {
        val (b, c) = readLine()!!.split(" ").map { it.toInt() }
        total += (c - b) * (a[b] ?: 0)
        a[c] = (a[c] ?: 0) + (a[b] ?: 0)
        a[b] = 0
        println(total)
    }
}

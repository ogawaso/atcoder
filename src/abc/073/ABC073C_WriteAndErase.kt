fun main() {
    val n = readLine()!!.toInt()

    val a = IntArray(n) { 0 }

    for (i in 0 until n) {
        a[i] = readLine()!!.toInt()
    }

    val grouped = a.toMutableList().groupBy { it }.mapValues { it.value.size }

    print(grouped.filterValues { it % 2 != 0}.entries.size)
}

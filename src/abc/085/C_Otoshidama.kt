fun main() {
    val (N, Y) = readLine()!!.split(" ").map { it.toInt() }

    for (i in (0..N)) {
        for (j in (0..N)) {
            val k = N - i - j
            if (k < 0) {
                continue
            }

            if (10000 * i + 5000 * j + 1000 * k == Y) {
                println("$i $j $k")
                return
            }
        }
    }
    println("-1 -1 -1")
}

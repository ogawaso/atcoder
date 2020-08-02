fun main() {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }
    val K = readLine()!!.toInt()

    for (i in 0..K) {
        for (j in 0..(K - i)) {
            for (k in 0..(K - i - j)) {
                val a = if (i > 0) A * Math.pow(2.toDouble(), i.toDouble()).toInt() else A
                val b = if (j > 0) B * Math.pow(2.toDouble(), j.toDouble()).toInt() else B
                val c = if (k > 0) C * Math.pow(2.toDouble(), k.toDouble()).toInt() else C
                if (b > a && c > b) {
                    print("Yes")
                    return
                }
            }
        }
    }
    print("No")
}

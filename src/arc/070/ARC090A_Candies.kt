fun main() {
    val n = readLine()!!.toInt()
    val a0 = readLine()!!.split(" ").map { it.toInt() }
    val a1 = readLine()!!.split(" ").map { it.toInt() }

    val s0 = IntArray(n) { 0 }
    val s1 = IntArray(n) { 0 }

    s0[0] = a0[0]
    s1[0] = a1[0]
    for (i in 1 until n) {
        s0[i] += a0[i] + s0[i - 1]
        s1[i] += a1[i] + s1[i - 1]
    }

    var answer = 0

    for (i in 0 until n) {
        val second = if (i == 0) s1[n - 1] else s1[n - 1] - s1[i - 1]
        val total = s0[i] + second
        if (answer < total) {
            answer = total
        }
    }

    println(answer)
}

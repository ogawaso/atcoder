fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    val wCounts = IntArray(n) { 0 }
    val eCounts = IntArray(n) { 0 }

    for (i in 0 until n) {
        if (s[i] == 'W') {
            wCounts[i] = if (i == 0 ) 1 else wCounts[i - 1] + 1
            eCounts[i] = if (i == 0 ) 0 else eCounts[i - 1]
        } else if (s[i] == 'E') {
            wCounts[i] = if (i == 0 ) 0 else wCounts[i - 1]
            eCounts[i] = if (i == 0 ) 1 else eCounts[i - 1] + 1
        }
    }

    var answer = n
    for (i in 0 until n) {
        val wCount = if (i == 0) 0 else wCounts[i - 1]
        val eCount = eCounts[n - 1] - eCounts[i]
        val tmp = wCount + eCount

        if (tmp < answer) {
            answer = tmp
        }
    }
    print(answer)
}

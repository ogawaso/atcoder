// ACにならない理由がよー分からん。。
fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val m = input[1].toInt()
    val k = input[2].toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }
    val b = readLine()!!.split(" ").map { it.toLong() }

    var i = 0
    var j = 0

    val c = mutableListOf<Long>()

    while (i < n || j < m ) {
        if (i == n) {
            c.add(b[j])
            j += 1
        } else if (j == m) {
            c.add(a[i])
            i += 1
        } else if (a[i] <= b[j]) {
            c.add(a[i])
            i += 1
        } else {
            c.add(b[j])
            j += 1
        }
    }

    var total = 0L
    var answer = 0
    for (x in c) {
        total += x
        if (k < total) {
            break
        }
        answer += 1
    }
    print(answer)
}

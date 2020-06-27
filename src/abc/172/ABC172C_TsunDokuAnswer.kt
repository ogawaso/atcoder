import java.lang.Integer.max

fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val m = input[1].toInt()
    val k = input[2].toLong()
    val A = readLine()!!.split(" ").map { it.toLong() }
    val B = readLine()!!.split(" ").map { it.toLong() }

    val a = mutableListOf<Long>(0)
    for (i in 0 until n) {
        a.add(a[i] + A[i])
    }

    val b = mutableListOf<Long>(0)
    for (i in 0 until m) {
        b.add(b[i] + B[i])
    }

    var answer = 0
    var j = m


    for (i in 0 until (n + 1)) {
        if (a[i] > k) {
            break
        }

        while (b[j] > k - a[i]) {
            j -= 1
        }

        answer = max(answer, i + j)

    }

    print(answer)
}

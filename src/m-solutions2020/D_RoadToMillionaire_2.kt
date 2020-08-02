fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toLong() }

    var current = 1000L

    for (i in 0 until N - 1) {

        var stock = 0L
        if (A[i] < A[i + 1]) {
            stock = current / A[i]
        }
        current += (A[i + 1] - A[i]) * stock
    }
    print(current)
}

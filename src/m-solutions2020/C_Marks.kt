fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toLong()}

    for (i in 0 until N - K) {
        if (A[i] < A[K+i]) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

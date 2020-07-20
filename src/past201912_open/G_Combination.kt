fun main() {
    val N = readLine()!!.toInt()

    val a = Array(10) { Array(10) { 0 } }

    for (i in 0 until N) {
        for (j in i + 1 until N ) {
            a[i][j] = readLine()!!.split(" ").map { it.toInt() }
        }
    }
}

fun main() {
    val N = readLine()!!.toInt()

    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j == N) {
                println("Yes")
                return
            }
        }
    }

    println("No")
}

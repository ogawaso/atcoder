fun main() {
    val n = readLine()!!.toInt()

    for (i in (1..10)) {
        val tmp = 1000 * i
        if (n <= tmp) {
            println(tmp - n)
            return
        }
    }
}

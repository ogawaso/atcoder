fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    val answer = if (b % a == 0) {
        b/a
    } else {
        b/a + 1
    }

    print(answer)
}

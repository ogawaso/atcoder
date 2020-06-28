fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val answer = if ((b - a) % 2 == 0) "Alice" else "Borys"

    print(answer)

}

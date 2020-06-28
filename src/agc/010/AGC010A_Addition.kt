fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val oddCount = a.filter { it % 2 == 1 }.size

    val answer = if (oddCount % 2 == 0) "YES" else "NO"

    print(answer)
}

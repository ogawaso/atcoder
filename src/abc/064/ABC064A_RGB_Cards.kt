//https://atcoder.jp/contests/abc064/tasks/abc064_a
fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val r = input[0]
    val g = input[1]
    val b = input[2]

    val n = 100 * r + 10 * g + b

    val result = if (n % 4 == 0) "YES" else "NO"
    print(result)
}

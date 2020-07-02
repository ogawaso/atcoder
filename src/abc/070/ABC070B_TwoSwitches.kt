/**
 * https://atcoder.jp/contests/abc070/tasks/abc070_b
 */
fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    val min = if (a < c) c else a
    val max = if (b < d) b else d

    val answer = if (min > max) {
       0
    } else {
        max - min
    }
    print(answer)
}

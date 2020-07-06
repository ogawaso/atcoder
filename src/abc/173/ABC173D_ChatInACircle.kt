/**
 * https://atcoder.jp/contests/abc079/tasks/abc079_d
 * 以下のは間違っている
 */
fun main() {
    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map { it.toLong() }.sorted().reversed()

    print(a.subList(0, a.size - 1).sum())
}
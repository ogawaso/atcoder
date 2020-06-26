/**
 * https://atcoder.jp/contests/abc093/tasks/arc094_a
 */
fun main() {
    var (a, b, c) = readLine()!!.split(" ")
        .map { it.toInt() }.sorted()

    var answer = 0

    val operation1 = (c - b) / 2
    answer += operation1
    b += operation1 * 2

    val operation2 = (c - a) / 2
    answer += operation2
    a += operation2 * 2

    if (a == b && b == c) {
        print(answer)
        return
    }

    if (a == b) {
        answer += 1
    }

    if (b == c) {
        answer += 2
    }

    if (a == c) {
        answer += 2
    }
    print(answer)
}

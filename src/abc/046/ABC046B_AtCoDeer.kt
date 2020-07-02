fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    if (n == 1) {
        print(k)
        return
    }

    var answer = k

    for (i in (2 .. n)) {
        answer *= (k - 1)
    }
    print(answer)
}

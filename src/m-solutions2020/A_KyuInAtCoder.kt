fun main() {
    val X = readLine()!!.toInt()

    val answer = when(X) {
        in 400..599 -> 8
        in 600..799 -> 7
        in 800..999 -> 6
        in 1000..1199 -> 5
        in 1200..1399 -> 4
        in 1400..1599 -> 3
        in 1600..1799 -> 2
        in 1800..1999 -> 1
        else -> 0
    }

    print(answer)
}

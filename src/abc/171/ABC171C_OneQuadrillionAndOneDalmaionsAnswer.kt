fun main() {
    var n = readLine()!!.toLong()
    val result = mutableListOf<Char>();

    while (n > 0) {
        n -= 1
        val pos = (n % 26).toInt()
        result.add('a' + pos)
        n /= 26L
    }

    print(result.reversed().joinToString(""))
}

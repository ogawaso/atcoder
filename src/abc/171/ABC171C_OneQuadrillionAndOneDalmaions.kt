import kotlin.math.pow

fun main() {
    var n = readLine()!!.toLong()
    val result = mutableListOf<Char>();

    for (i in (1..99)) {
        val pow = 26.toDouble().pow(i.toDouble()).toInt()
        if (n <= pow) {
            n -= 1
            for (j in (1..i)) {
                result.add('a' + (n % 26).toInt())
                n = n / 26
            }
            break

        } else {
            n -= pow
        }
    }

    print(result.reversed().joinToString(""))
}

import kotlin.math.sqrt


// 普通に書いても遅くてACは無理なやつ
fun main() {
    val n = readLine()!!.toInt()

    var answer = 0L
    for (i in (1..n)) {
        answer += i * f(i)
    }
    println(answer)
}

fun f(x: Int): Int {
    if (x == 1) {
        return 1
    }

    if (x == 2) {
        return 2
    }

    if (x == 3) {
        return 2
    }

    val y = sqrt(x.toDouble()).toInt()

    var result = 0
    for (i in (1..y)) {
        if (x % i == 0) {
            result += 1
            if (x / i != i) {
                result += 1
            }
        }
    }

    return result
}
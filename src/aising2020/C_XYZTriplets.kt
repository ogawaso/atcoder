import kotlin.math.sqrt

fun main() {
    val N = readLine()!!.toInt()

    var fMap = HashMap<Int, Int>()
    for (i in 1..N) {
        fMap[i] = 0
    }

    val max = sqrt(N.toDouble()).toInt()
    for (x in (1..max)) {
        for (y in (1..max)) {
            for (z in (1..max)) {
                val n = x * x + y * y + z * z + x * y + y * z + z * x
                fMap[n] = (fMap[n] ?: 0) + 1
            }
        }
    }

    for (i in 1..N) {
        println(fMap[i])
    }
}


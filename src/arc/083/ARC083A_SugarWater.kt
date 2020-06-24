fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    val c = input[2]
    val d = input[3]
    val e = input[4]
    val f = input[5]

    val iMax = f / (a * 100)
    val jMax = f / (b * 100)
    val kMax = f / c
    val lMax = f / d

    var max = 0.0
    var answerSugarWater = 0
    var answerSugar = 0

    for (i in (0..iMax)) {
        for (j in (0..jMax)) {
            val water = 100 * a * i + 100 * b * j
            if (water in 1 until f) {
                for (k in (0..kMax)) {
                    for (l in (0..lMax)) {
                        val sugar = c * k + d * l
                        val total = water + sugar
                        val density = sugar * 100.0 / water
                        if (total <= f && density <= e.toDouble() && max <= density) {
                            max = density
                            answerSugarWater = total
                            answerSugar = sugar
                        }
                    }
                }
            }
        }
    }

    print("$answerSugarWater $answerSugar")
}



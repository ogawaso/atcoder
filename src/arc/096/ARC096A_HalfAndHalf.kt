fun main() {
    val (a, b, c, x, y) = readLine()!!.split(" ").map { it.toInt() }

    var answer = a * x + b * y

    val r = if (x > y) {
        2 * x
    } else {
        2 * y
    }

    var i = 2
    while (i <= r) {
        val aCount = if ( x > i / 2)  x - i / 2 else 0
        val bCount = if ( y > i / 2)  y - i / 2 else 0
        val sum = a * aCount + b * bCount + c * i
        if (sum < answer) {
            answer = sum
        }
        i += 2
    }
    print(answer)
}

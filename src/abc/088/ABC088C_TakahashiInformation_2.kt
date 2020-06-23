fun main() {
    val (c11, c12, c13) = readLine()!!.split(" ").map { it.toInt() }
    val (c21, c22, c23) = readLine()!!.split(" ").map { it.toInt() }
    val (c31, c32, c33) = readLine()!!.split(" ").map { it.toInt() }

    val a1 = 0
    val b1 = c11 - a1
    val b2 = c12 - a1
    val b3 = c13 - a1
    val a2 = c21 - b1
    val a3 = c31 - b1

    if (a2 + b2 == c22 && a3 + b2 == c32 && a2 + b3 == c23 && a3 + b3 == c33) {
        print("Yes")
    } else {
        print("No")
    }
}


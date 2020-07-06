fun main() {
    val (a, b, c, d) = readLine()!!.map { it.toString().toInt() }

    val mask = 1.shl(3)
    for (i in 0 until mask) {
        var tmp = a
        var op1 = ""
        if (i.shr(0).and(1) == 1) {
            tmp += b
            op1 = "+"
        } else {
            tmp -= b
            op1 = "-"
        }

        var op2 = ""
        if (i.shr(1).and(1) == 1) {
            tmp += c
            op2 = "+"
        } else {
            tmp -= c
            op2 = "-"
        }

        var op3 = ""
        if (i.shr(2).and(1) == 1) {
            tmp += d
            op3 = "+"
        } else {
            tmp -= d
            op3 = "-"
        }

        if (tmp == 7) {
            print("$a$op1$b$op2$c$op3$d=7")
            return
        }
    }

}

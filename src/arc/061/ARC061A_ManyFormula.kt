fun main() {
    val s = readLine()!!.map { it.toString() }
    val length = s.size

    val pattern = 1.shl(length - 1)

    var answer = 0L
    for (i in 0 until pattern) {
        var tmp = s[0]
        for (j in 0 until (length - 1) ) {
            if (i.shr(j).and(1) == 0) {
                tmp += "+"
            }
            tmp += s[j + 1]
        }
        answer += calc(tmp)
    }
    println(answer)
}

fun calc(str: String): Long {
    return str.split("+").map { it.toLong() }.sum()
}

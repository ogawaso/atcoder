fun main() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()

    var answer = 1

    for (i in 0 until n) {
        if (answer * 2 <= answer + k) {
            answer = answer * 2
        } else {
            answer += k
        }
    }

    println(answer)
}

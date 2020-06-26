import java.lang.Long.min

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    var answer1 = getAnswer(a, true)
    var answer2 = getAnswer(a, false)


    print(min(answer1, answer2))
}

fun getAnswer(a: List<Long>, initial: Boolean): Long {
    var answer = 0L
    var total = 0L
    var isPlus = initial
    for (x in a) {
        total += x

        if (isPlus) {
            if (total <= 0) {
                answer += -total + 1
                total = 1
            }
        } else {
            if (total >= 0) {
                answer += total + 1
                total = -1
            }
        }

        isPlus = !isPlus
    }

    return answer
}

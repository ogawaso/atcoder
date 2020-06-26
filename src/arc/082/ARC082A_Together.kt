fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ")
        .map { it.toInt() }.groupBy { it }.mapValues { it.value.size }


    var answer = 0
    for (x in a) {
        val tmp = x.value + (a[x.key - 1] ?: 0) + (a[x.key + 1] ?: 0)
        if (answer < tmp) {
            answer = tmp
        }
    }
    println(answer)
}

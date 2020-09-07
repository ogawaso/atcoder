fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Work>()
    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        list.add(Work(a, b))
    }
    list.sortBy { it.b }

    var total = 0
    for (d in list) {
        total += d.a
        if (total > d.b) {
            print("No")
            return
        }
    }
    print("Yes")
}

data class Work(val a: Int, val b: Int)
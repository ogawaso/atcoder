fun main() {
    val n = readLine()!!.toInt()
    val a = mutableListOf<Int>()

    a.add(0)
    for (i in 0 until n) {
        a.add(readLine()!!.toInt())
    }

    a.sort()
    val duplicatedMap = a.groupBy { it }.filter { it.value.size == 2 }
    if (duplicatedMap.isEmpty()) {
        println("Correct")
        return
    }
    val duplicated = duplicatedMap.keys.first()
    a.remove(duplicated)

    var erased = n
    for (i in (0..n - 1)) {
        if (a[i] != i) {
            erased = i
            break
        }
    }
    println("$duplicated $erased")
}

// https://atcoder.jp/contests/arc086/tasks/arc086_a
fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0]
    val k = input[1]
    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val aMap = HashMap<Int, Int>()

    for (x in a) {
        aMap[x]?.let {
            aMap[x] = it + 1
        }

        if (aMap[x] == null) {
            aMap[x] = 1
        }
    }
    val sortedMap = aMap.toList().sortedBy { it.second }.toMap()

    var reduce = aMap.entries.size - k
    if (reduce <= 0) {
        print(0)
        return
    }

    var result = 0

    for (x in sortedMap) {
        result += x.value
        reduce -= 1

        if (reduce == 0) {
            print(result)
            return
        }
    }
}

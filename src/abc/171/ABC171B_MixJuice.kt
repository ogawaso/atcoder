fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0]
    val k = input[1]

    val p = readLine()!!.split(" ").map { it.toInt() }.sorted()

    print(p.subList(0, k).sum())
}

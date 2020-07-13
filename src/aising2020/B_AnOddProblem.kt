fun main() {
    val N = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    println(a.filterIndexed { index, i ->  index % 2 == 0 && i % 2 == 1 }.size)
}

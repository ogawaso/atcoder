fun main() {
    var (L, R, d) = readLine()!!.split(" ").map { it.toInt() }

    println(R/d - (L - 1)/d)
}

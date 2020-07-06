/**
 * https://atcoder.jp/contests/abc173/tasks/abc173_c
 */
fun main() {
    val (h, w, k) = readLine()!!.split(" ").map { it.toInt() }
    val cList = Array(h) { "" }
    for (i in 0 until h) {
        cList[i]= readLine()!!
    }

    debug(0)
    debug(1)
    debug(2)
    debug(3)

    var answer = 0
    for (maskR in 0 until 1.shl(h)) {
        for (maskC in 0 until 1.shl(w)) {
            var black = 0
            for (i in 0 until h) {
                for (j in 0 until w) {
                    if (maskR.shr(i).and(1) == 0 && maskC.shr(j).and(1) == 0 && cList[i][j] == '#') {
                         black += 1
                    }
                }
            }

            if (black == k) {
                answer += 1
            }

        }
    }

    print(answer)
}

fun debug(n: Int) {
    println("n=$n")
    println(n.shr(0).and(1))
    println(n.shr(1).and(1))
    println(n.shr(2).and(1))
    println(n.shr(3).and(1))

}

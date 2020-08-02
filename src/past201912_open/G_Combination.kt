fun main() {
    val N = readLine()!!.toInt()
    val a = Array(N) { Array(N) { 0 } }

    for (i in 0 until N - 1) {
        var a2 = readLine()!!.split(" ").map { it.toInt() }
        var k = 0
        for (j in i + 1 until N ) {
            a[i][j] = a2[k]
            a[j][i] = a2[k]
            k += 1
        }
    }
    print(dfs(N, a, 0, Array(N) { 0 }))
}

fun dfs(N: Int, a: Array<Array<Int>>, d: Int, group: Array<Int>) : Int {
    if (d == N) {
        var point = 0
        for (i in 0 until N) {
            for (j in i + 1 until N) {
                if (group[i] == group[j]) {
                    point += a[i][j]
                }
            }
        }

        return point

    } else {
        var answer = Int.MIN_VALUE
        for (i in 0 until 3) {
            group[d] = i
            answer = Math.max(answer, dfs(N, a, d + 1, group))
        }

        return answer
    }
}

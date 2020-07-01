fun main() {
    val (h, m) = readLine()!!.split(" ").map { it.toInt() }
    var sList = Array<String>(h) { i -> "" }
    for (i in 0 until h) {
        sList[i] = readLine()!!
    }

    val answerList = Array<String>(h) { i -> ""}

    val dx = arrayOf(-1, 0, 1, -1, 1, -1, 0, 1)
    val dy = arrayOf(-1, -1, -1, 0, 0, 1, 1, 1)

    for (i in 0 until h) {
        var answer = ""
        for (j in 0 until m) {
            if (sList[i][j] == '#') {
                answer += "#"
                continue
            }

            var count = 0
            for (k in 0 until 8) {
                val ni = i + dy[k]
                val nj = j + dx[k]

                if (ni < 0 || ni > h - 1) {
                    continue
                }

                if (nj < 0 || nj > m - 1) {
                    continue
                }

                if (sList[ni][nj] == '#') {
                    count += 1
                }
            }
            answer += count.toString()
        }
        answerList[i] = answer
    }

    for (x in answerList) {
        println(x)
    }
}

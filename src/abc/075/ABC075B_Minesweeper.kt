fun main() {
    val (h, m) = readLine()!!.split(" ").map { it.toInt() }
    var sList = Array<String>(h) { i -> "" }
    for (i in 0 until h) {
        sList[i] = readLine()!!
    }

    val answerList = Array<String>(h) { i -> ""}

    for (i in 0 until h) {
        var answer = ""
        for (j in 0 until m) {
            var count = 0
            if (sList[i][j] == '#') {
                answer += "#"
                continue
            }

            if (i - 1 >= 0) {
                if (j - 1 >= 0) {
                    if (sList[i - 1][j - 1] == '#') {
                        count += 1
                    }
                }

                if (sList[i - 1][j] == '#') {
                    count += 1
                }

                if (j + 1 <= m - 1) {
                    if (sList[i - 1][j + 1] == '#') {
                        count += 1
                    }
                }
            }

            if (j - 1 >= 0) {
                if (sList[i][j - 1] == '#') {
                    count += 1
                }
            }

            if (j + 1 <= m - 1) {
                if (sList[i][j + 1] == '#') {
                    count += 1
                }
            }

            if (i + 1 <= h - 1) {
                if (j - 1 >= 0) {
                    if (sList[i + 1][j - 1] == '#') {
                        count += 1
                    }
                }

                if (sList[i + 1][j] == '#') {
                    count += 1
                }

                if (j + 1 <= m - 1) {
                    if (sList[i + 1][j + 1] == '#') {
                        count += 1
                    }
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

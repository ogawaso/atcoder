/**
 * https://atcoder.jp/contests/abc096/tasks/abc096_c
 */
fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    var sList = Array<String>(h) { i -> "" }
    for (i in 0 until h) {
        sList[i] = readLine()!!
    }

    if (sList.toList().all { !it.contains('#')}) {
        print("Yes")
        return
    }

    val dx = arrayOf(0, -1, 1, 0)
    val dy = arrayOf(-1, 0, 0, 1)

    for (i in 0 until h) {
        for (j in 0 until w) {
            if (sList[i][j] == '#') {
                var count = 0
                for (k in 0 until 4) {
                    val di = i + dy[k]
                    val dj = j + dx[k]

                    if (di < 0 || di > h - 1) {
                        continue
                    }

                    if (dj < 0 || dj > w - 1) {
                        continue
                    }

                    if (sList[di][dj] == '#') {
                        count += 1
                    }
                }
                if (count == 0) {
                    print("No")
                    return
                }
            }


        }
    }

    print("Yes")
}

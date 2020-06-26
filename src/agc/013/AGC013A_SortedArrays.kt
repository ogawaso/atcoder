fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }

    if (a.size == 1) {
        print(1)
        return
    }

    var tmp = a[0]
    var answer = 1
    var status = 0 // 0: 初期状態 1: 増加中 2:減少中
    for (i in 1 until n) {
        if (tmp < a[i]) {
            tmp = a[i]
            if (status == 0) {
                status = 1
            }

            if (status == 2) {
                answer += 1
                status = 0
            }
        } else if (a[i] < tmp) {
            tmp = a[i]
            if (status == 0) {
                status = 2
            }
            if (status == 1) {
                answer += 1
                status = 0
            }
        }
    }

    print(answer)
}

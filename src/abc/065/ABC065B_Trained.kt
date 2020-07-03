fun main() {
    val n = readLine()!!.toInt()

    val a = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        a[i + 1] = readLine()!!.toInt()
    }

    var i = 1
    var count = 0
    while (true) {
        count += 1
        i = a[i]
        if (i == 2) {
            print(count)
            return
        }
        if (count == n) {
            break
        }
    }

    print(-1)
}

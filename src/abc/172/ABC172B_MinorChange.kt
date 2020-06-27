fun main() {
    val s = readLine()!!.toCharArray()
    val t = readLine()!!.toCharArray()

    var answer = 0

    for (i in 0 until s.size) {
        if (s[i] != t[i]) {
            answer += 1
        }
    }
    print(answer)
}

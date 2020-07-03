fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    val start =
        if (a < b) {
            var i = 2
            while (true) {
                if (a * i >= b) {
                    break
                }
                i += 1
            }
            i
        } else {
            1
        }

    val initial = (start * a) % b
    if (initial == c) {
        print("YES")
        return
    }

    var i = start + 1
    while (true) {
        val remainder = (a * i)  % b
        if (remainder == c) {
            print("YES")
            return
        }

        if (remainder == initial) {
            print("NO")
            return
        }
        i += 1
    }

}

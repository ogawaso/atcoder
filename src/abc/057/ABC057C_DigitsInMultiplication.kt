import kotlin.math.sqrt

fun main() {
    var n = readLine()!!.toLong()
    if (n < 10) {
        print(1)
        return
    }

    val x = sqrt(n.toDouble()).toLong()

    var i = 1L

    var answer = Int.MAX_VALUE
    while (i <= x) {
        if ( n % i == 0L) {
            val a= i.toString().toCharArray().size
            val b= (n/i).toString().toCharArray().size
            val max = if (a < b ) b else a

            if (max < answer) {
                answer = max
            }
        }
        i+= 1
    }

    print(answer)

}


import java.math.BigInteger

fun main() {
    val N = readLine()!!.toInt()
    val x = readLine()!!

    for (i in 0 until N) {
        println(calc(x, i, N))
    }
}

fun calc(x: String, i: Int, N: Int): BigInteger {
    var replaced = x.toCharArray()
    replaced[i] = if (replaced[i] == '0') '1' else '0'

    replaced = replaced.reversedArray()
    var target = BigInteger.ZERO
    var tmp = BigInteger.ONE
    for (i in 0 until N) {
        tmp = if (i > 0)  tmp.multiply(BigInteger("2")) else tmp
        if (replaced[i] == '1') {
            target += tmp
        }
    }
    return calcF(target)
}

fun calcF(i: BigInteger): BigInteger {
    if (i == BigInteger.ZERO) {
        return BigInteger.ZERO
    }
    val popCount = i.bitCount()
    val divided = i.mod(popCount.toBigInteger())
    return BigInteger.ONE + calcF(divided)
}

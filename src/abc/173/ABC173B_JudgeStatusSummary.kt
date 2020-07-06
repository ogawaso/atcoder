fun main() {
    val n = readLine()!!.toInt()

    val sMap = HashMap<String, Int>()
    for (i in 0 until n) {
        val s = readLine()!!

        sMap[s] = (sMap[s] ?: 0) + 1
    }
    sMap["AC"] = sMap["AC"] ?: 0
    sMap["WA"] = sMap["WA"] ?: 0
    sMap["TLE"] = sMap["TLE"] ?: 0
    sMap["RE"] = sMap["RE"] ?: 0

    println("AC x " + sMap["AC"])
    println("WA x " + sMap["WA"])
    println("TLE x " + sMap["TLE"])
    println("RE x " + sMap["RE"])
}

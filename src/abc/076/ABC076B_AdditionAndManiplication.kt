fun main() {
    val N= readLine()!!.toInt()
    val K = readLine()!!.toInt()

    print(dfs(N, 1, K))
}

fun dfs(remain: Int, now:Int, K:Int): Int {
    if (remain == 0) {
        return now
    }

    return Math.min(dfs(remain - 1, now *2, K), dfs(remain - 1, now + K, K))
}

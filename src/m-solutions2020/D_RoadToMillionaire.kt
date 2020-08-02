fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    print(dfs(1000, 0, 1, N, A))
}

fun dfs(total: Int, stock: Int, i:Int, N:Int, A: List<Int>):Int {
    if (i == N + 1) {
        return total
    } else {
        var temp = Int.MIN_VALUE
        val buyMaxCount = total / A[i - 1]
        var stockPrice = if (buyMaxCount == 0) 0 else A[i - 1] * buyMaxCount
        temp = Math.max(temp, dfs(total - stockPrice, stock + buyMaxCount,i + 1, N, A))

        stockPrice = if (stock == 0 ) 0 else A[i - 1] * stock
        temp = Math.max(temp, dfs(total + stockPrice, 0, i + 1, N, A))

        return temp
    }
}
/**
 * https://atcoder.jp/contests/practice/tasks/practice_1
 */
fun main() {
   val a = readLine()!!.toInt()
   val input = readLine()!!.split(" ").map { it.toInt() }
   val b = input[0]
   val c = input[1]
   val s  = readLine()!!

   println("${a + b+ c} $s")
}
fun main() {
    val (c11, c12, c13) = readLine()!!.split(" ").map { it.toInt() }
    val (c21, c22, c23) = readLine()!!.split(" ").map { it.toInt() }
    val (c31, c32, c33) = readLine()!!.split(" ").map { it.toInt() }

    for (a1 in (0..100)) {
        for (b1 in (0.. 100)) {
            if (a1 + b1 == c11) {
                for(a2 in (0..100)) {
                    for (b2 in (0..100)) {
                        if (a1 + b2 == c12 && a2 + b1 == c21 && a2 + b2 == c22) {
                           for (a3 in (0..100)) {
                               for (b3 in (0..100)) {
                                   if (a3 + b1 == c31 &&
                                       a3 + b2 == c32 &&
                                       a1 + b3 == c13 &&
                                       a2 + b3 == c23 &&
                                       a3 + b3 == c33) {
                                       print("Yes")
                                       return
                                   }
                               }
                           }
                        }
                    }
                }

            }
        }
    }

    print("No")
}

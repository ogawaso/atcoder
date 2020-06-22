fun main() {
    val a = readLine()!!

    if (Regex("""[a-z]""").matches(a)) {
        print("a")
    } else if (Regex("""[A-Z]""").matches(a)) {
        print("A")
    }

}

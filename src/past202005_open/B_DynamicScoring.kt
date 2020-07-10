fun main() {
    val (n, m, q) = readLine()!!.split(" ").map { it.toInt() }

    val scores = HashMap<Int, MutableList<Int>>()
    val scoresByQuestion = HashMap<Int, Int>()
    val answeredCounts = HashMap<Int, Int>()
    val queries = Array(q) { "" }

    for (i in 0 until q) {
        queries[i] = readLine()!!
    }

    for (i in 0 until q) {
        val s = queries[i].split(" ").map { it.toInt() }
        val kind = s[0]
        val participant = s[1]
        if (kind == 1) {
            println(scores[participant]?.map { scoresByQuestion[it] ?: 0 }?.sum() ?: 0)
        } else if (kind == 2) {
            val question = s[2]
            val answeredByQuestion = (answeredCounts[question] ?: 0) + 1
            answeredCounts[question] = answeredByQuestion
            scoresByQuestion[question] = n - answeredByQuestion
            val scoresByParticipant = (scores[participant] ?: mutableListOf())
            scoresByParticipant.add(question)
            scores[participant] = scoresByParticipant
        }
    }
}

fun main() {

    val mapping = mapOf(
        "A" to 0,
        "B" to 1,
        "C" to 2,
        "X" to 0,
        "Y" to 1,
        "Z" to 2,
    )

    fun score(theirs: Int, mine: Int) = mine + 1 + ((mine - theirs).mod(3) + 1) % 3 * 3

    fun score2(theirs: Int, mine: Int) = (theirs - 1 + mine).mod(3) + 1 + (mine * 3)

    fun part1(input: List<String>) = input.sumOf {
        it
            .split(" ")
            .let { score(mapping[it[0]]!!, mapping[it[1]]!!) }
    }

    fun part2(input: List<String>) = input.sumOf {
        it
            .split(" ")
            .let { score2(mapping[it[0]]!!, mapping[it[1]]!!) }
    }

    val testInput = readInput("Day02_test")
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

fun main() {
    fun part1(input: List<String>): Int {
        return input.joinToString("\n")
            .split("\n\n")
            .map { it.split("\n") }
            .map { it.fold(0) { acc, i -> acc + i.toInt() } }
            .max()
    }

    fun part2(input: List<String>): Int {
        return input.joinToString("\n")
            .split("\n\n")
            .map { it.split("\n") }
            .map { it.fold(0) { acc, i -> acc + i.toInt() } }
            .sorted()
            .takeLast(3)
            .sum()
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}

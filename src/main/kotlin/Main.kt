fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""

    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        if (char.isLetterOrDigit()) {
            charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
        }
    }

    val sortedChars = charCountMap.keys.toList().sorted()

    println("Количество различных символов в строке:")
    for (char in sortedChars) {
        println("$char: ${charCountMap[char]}")
    }
}
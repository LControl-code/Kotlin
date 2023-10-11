fun numCountToChar(numberPressed: String, count: Int): Char {
    val numberToTextMap = mapOf(
        "1" to ".,?!:",
        "2" to "abc",
        "3" to "def",
        "4" to "ghi",
        "5" to "jkl",
        "6" to "mno",
        "7" to "pqrs",
        "8" to "tuv",
        "9" to "wxyz",
        "0" to " "
    )
    val numberTextIndex = count % numberToTextMap[numberPressed]!!.length
    return numberToTextMap[numberPressed]!![numberTextIndex]
}

fun convertNumberToText(inputNumberText: String): String {
    var outputText = ""
    var previousNumber = inputNumberText[0].toString()
    var count = -1

    for (number in inputNumberText) {
        val numberText = number.toString()
        if (numberText == previousNumber) {
            count++
        } else {
            outputText += numCountToChar(previousNumber, count)
            count = 0
        }

        previousNumber = numberText
    }
    outputText += numCountToChar(previousNumber, count)

    return outputText
}

fun main() {
    val inputNumberText = readlnOrNull() ?: return
    val outputText = convertNumberToText(inputNumberText)
    println(outputText)
}
fun convertMorseCodeToText(inMorseCode : String) :String {
    val morseCodeMap = mapOf(
        "A" to "•–",
        "B" to "–•••",
        "C" to "–•–•",
        "D" to "–••",
        "E" to "•",
        "F" to "••–•",
        "G" to "––•",
        "H" to "••••",
        "I" to "••",
        "J" to "•–––",
        "K" to "–•–",
        "L" to "•–••",
        "M" to "––",
        "N" to "–•",
        "O" to "–––",
        "P" to "•––•",
        "Q" to "––•–",
        "R" to "•–•",
        "S" to "•••",
        "T" to "–",
        "U" to "••–",
        "V" to "•••–",
        "W" to "•––",
        "X" to "–••–",
        "Y" to "–•––",
        "Z" to "––••",
        "0" to "–––––",
        "1" to "•––––",
        "2" to "••–––",
        "3" to "•••––",
        "4" to "••••–",
        "5" to "•••••",
        "6" to "–••••",
        "7" to "––•••",
        "8" to "–––••",
        "9" to "––––•"
    )
    var outputText = ""

    for (morseCode in inMorseCode.split("/")) {
        outputText += morseCodeMap.entries.find { it.value == morseCode }?.key ?: " "
    }

    return outputText
}

fun main(){
    val inputMorseCode = readlnOrNull() ?: return
    val outputText = convertMorseCodeToText(inputMorseCode)
    println(outputText)
}
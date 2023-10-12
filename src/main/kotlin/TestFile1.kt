fun main() {
    val n = readlnOrNull()?.toInt() ?: 0
    val nPlates = mutableListOf<String>()

    for (i in 1..n) {
        val inputPlate = readlnOrNull()?.uppercase()
        if (inputPlate != null && inputPlate.length == 9) {
            nPlates.add(inputPlate)
        } else {
            println("Invalid input: $inputPlate")
        }
    }

    val countILPlates = nPlates.count { it.startsWith("IL") }

    val percentage = if (nPlates.isNotEmpty()) {
        String.format("%.2f", countILPlates.toDouble() / nPlates.size * 100)
    } else {
        "0.00"
    }

    println("$countILPlates $percentage%")
}
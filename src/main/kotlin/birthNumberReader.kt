fun main() {
    try {
        val inputBirthNumber = readlnOrNull()?.trim() ?: ""

        if (inputBirthNumber.length != 11) {
            throw Exception("Invalid length")
        }

        val year = inputBirthNumber.substring(0, 2)
        val yearPrefix = if (year.toInt() > 23) "19" else "20"
        val month = if (inputBirthNumber.substring(2, 4) > "50" && inputBirthNumber.substring(2,4) < "53") (inputBirthNumber.substring(2, 4).toInt() - 50).toString() else inputBirthNumber.substring(2, 4)
        val day = inputBirthNumber.substring(4, 6)

        if (day.toInt() > 31) {
            throw Exception("Invalid day")
        } else if (month.toInt() > 12) {
            throw Exception("Invalid month")
        }

        val gender = if (inputBirthNumber.substring(2, 4) > "50") "woman" else "man"

        println("${day.toInt()}.${month.toInt()}.${(yearPrefix + year).toInt()} - $gender")
    } catch (e: Exception) {
        println("Invalid birth number: ${e.message}")
    }
}

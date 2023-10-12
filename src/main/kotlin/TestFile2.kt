fun main() {
    val n = readlnOrNull()?.toInt() ?: 0

    for (i in 1..n) {
        val input = readlnOrNull()
        val issnParts = input?.split(" ", limit = 2)
        val issnNumber = issnParts?.get(0)

        try {
            if (issnNumber != null && issnNumber.length == 13 && issnNumber.startsWith("977")) {
                if (issnNumber.all { it.isDigit() }) {
                    val issnSum = issnNumber.substring(3, 10).map { it.toString().toInt() }.sum()
                    println(issnSum)
                } else {
                    throw Exception("Not all digits")
                }
            } else {
                throw Exception("Invalid ISSN")
            }
        } catch (e: Exception) {
            println("NIE JE ISSN")
        }

    }
}
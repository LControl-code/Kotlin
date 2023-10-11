/*
5. IBAN
IBAN je identifikátor v ktorom je zakomponovaný kód krajiny, kód banky, predčíslie aj číslo účtu. Na základe IBANu teda viete zistiť, ktorá banka spravuje daný účet.
 */

fun main() {
    val ibanNameMap = mutableMapOf(
        "7500" to "CSOB",
        "8360" to "mBank",
        "1100" to "Tatra",
        "0200" to "VUB"
    )

    val ibanInput = readlnOrNull()?.trim() ?: ""
    val ibanName = ibanInput.takeIf { it.length >= 8 }?.substring(4, 8)?.let { ibanNameMap[it] }

    println(ibanName ?: "Unknown bank")
}

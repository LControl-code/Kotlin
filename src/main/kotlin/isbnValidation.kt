/*
8. Validácia ISBN
Aj čiarové kódy často skrývajú nejakú dodatočnú informáciu o produkte. Už ste možno počuli, že prefix 858 na niektorých produktoch znamená, že výrobok bol vyrobený na slovensku. Viete však, že čiarový kód na knihe je zároveň jej jednoznačným identifikátorom? (tzv. ISBN)
 */

fun isValidISBN(isbn: String) : Boolean {
    val isbnDigits = isbn.filter { it.isDigit() }
    if (isbnDigits.length != 13) return false
    val checksum = isbnDigits.map { it.toString().toInt() }
        .mapIndexed { _, digit -> if(digit % 2 == 0) digit else digit * 3 }
        .sum()
    return checksum % 10 == 0
}

fun main() {
    println("Enter ISBN:")
    val isbn = readlnOrNull() ?: return
    println("ISBN is ${if (isValidISBN(isbn)) "valid" else "invalid"}")
}
/*
Podobne ako IBAN nesie informáciu o banke spravujúcej bankový účet, tak aj ISSN (sériové číslo pre publikáciu časopisu) nesie informáciu o tom, kto je vydavateľom danej knihy. Toto číslo je skryté v klasickom čiarovom kóde.
Čiarový kód obsahujúci ISSN sa skladá z trinástich číslic, ktoré majú nasledujúci formát:
Prvé 3 číslice sú 977
Ďalších 7 čísel je časť ISSN
Ostatné čísla momentálne neriešte (edícia a kontrolná číslica)
Na štandardnom vstupe načítajte celé číslo N. Následne N-krát načítajte čiarový kód (1 slovo) s názvom výtlačku (zvyšok riadku).
Pre každý riadok - overte, či je dané číslo obsahuje ISSN (skontrolujte dĺžku čiarového kódu a 977 na začiatku). V prípade nesprávneho formátu vypíšte chybu podľa ukážky. V prípade ISSN na štandardný výstup vypíšte súčet všetkých siedmych cifier ISSN (napr. ISSN 0123456 => 0 + 1 + 2 + 3 + 4 + 5 + 6 = 21)
 */

fun main() {
    val n = readlnOrNull()?.toInt() ?: 0

    for (i in 1..n) {
        val input = readlnOrNull()
        val issnParts = input?.split(" ", limit = 2)
        val issnNumber = issnParts?.get(0)
        if (issnNumber != null && issnNumber.length == 13 && issnNumber.startsWith("977")) {
             if (issnNumber.all { it.isDigit() }) {
                 val issnSum = issnNumber.substring(3, 10).map { it.toString().toInt() }.sum()
                 println(issnSum)
             } else {
                 println("NIE JE ISSN")
             }
        } else {
            println("NIE JE ISSN")
        }
    }
}
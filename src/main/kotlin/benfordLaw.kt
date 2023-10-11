/*
2. Benford’s law
Benfordov zákon slúži na rýchle odhadnutie podvodných bankových účtov (ale aj iných číselných údajov). Bežný používateľ bankového účtu totiž uskutočňuje transakcie rôznej hodnoty. Benfordov zákon prekvapivo dobre dokáže odhadnúť podvodnosť účtov kontrolovaním prvej číslice transakcií. Transakcií, ktoré začínajú jednotkou je napríklad vo všeobecnosti oveľa viac ako transakcií začínajúcich deviatkou.
Na štandardnom vstupe načítajte celé číslo N. Následne N-krát načítajte hodnotu transakcie ako desatinné číslo. Na štandardnom výstupe vypíšte, koľko z týchto transakcií sa začínalo číslom 5 a koľko je to percent z celkového počtu. Výsledné percento môžete a nemusíte zaokrúhliť.
 */

fun main() {
    val n = readlnOrNull()?.toInt() ?: 0
    val nTransactions = mutableListOf<Double>()

    for (i in 1..n) {
        val input = readlnOrNull()
        val transaction = input?.toDoubleOrNull()
        if (transaction != null) {
            nTransactions.add(transaction)
        } else {
            println("Invalid input: $input")
        }
    }

    val countFirstDigit5 = nTransactions.count { it.toString().firstOrNull() == '5' }

    val percentage = if (nTransactions.isNotEmpty()) {
        String.format("%.2f" ,countFirstDigit5.toDouble() / nTransactions.size * 100)
    } else {
        "0.00"
    }

    println("$countFirstDigit5 $percentage%")
}

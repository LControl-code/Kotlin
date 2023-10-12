/*
Každé auto na slovensku má ŠPZtku pozostávajúcu zo skratky okresu (IL = Ilava) a ďalších piatich znakov. Obvykle 3 čísla a 2 písmená.
Na štandardnom vstupe načítajte celé číslo N. Následne N-krát načítajte ŠPZ auta vo formáte AA-000-BB (napr. IL-080-AB). Teda ŠPZ bude mať vždy dĺžku 9 znakov. Na štandardný výstup vypíšte, koľko z týchto ŠPZ bolo vydaných v Ilave a koľko je to percent z celkového počtu. Zaokrúhľovanie nie je nutné.
 */

fun main() {
    val n = readlnOrNull()?.toInt() ?: 0
    val nPlates = mutableListOf<String>()

    for (i in 1..n) {
        val input = readlnOrNull()?.uppercase()
        if (input != null && input.length == 9) {
            nPlates.add(input)
        } else {
            println("Invalid input: $input")
        }
    }

    val countIlavaPlates = nPlates.count { it.startsWith("IL") }

    val percentage = if (nPlates.isNotEmpty()) {
        String.format("%.2f" ,countIlavaPlates.toDouble() / nPlates.size * 100)
    } else {
        "0.00"
    }

    println("$countIlavaPlates $percentage%")
}
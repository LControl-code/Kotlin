/*
1. Rozcvička - druhé mocniny
Na štandardnom vstupe načítajte celé číslo N a následne N celých čísel. Pre každé z načítaných čísel na štandardnom výstupe vypíšte ich druhú mocninu.
 */

fun main() {
    print("Enter the number of numbers: ")
    val n = readlnOrNull()?.toInt() ?: 0
    val nNumbers = mutableListOf<Int>()

    for (i in 1..n) {
        print("Enter $i. number: ")
        val number = readlnOrNull()?.toInt() ?: 0
        nNumbers.add(number)
    }

    for (i in 0..<n) {
        val squared = nNumbers[i] * nNumbers[i]
        println("${nNumbers[i]}^2 = $squared")
    }
}

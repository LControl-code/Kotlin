/*
4. Konečný priestor
Klasickým problémom pri programovaní top-bottom počítačových hier je určovanie pozície panáčikov na konečnej hracej doske. Viete zistiť, kde sa bude panáčik nachádzať po vykonaní série krokov na takejto doske?
Majme postavičku vloženú do 2D mriežky veľkosti 10x10 (minimálna súradnica je 0 maximálna 9) na súradnici [1, 1]. Súradnicový systém funguje ako je znázornené na obrázku 1, teda bod 0,0 je v ľavom hornom rohu obrazovky.
 */

fun main() {
    val validMoves = listOf("L", "R", "U", "D")
    var x = 1
    var y = 1

    val gridMax = 9
    val gridMin= 0

    while (true) {
        val input = readlnOrNull()?.uppercase()
        if (input in validMoves) {
            when (input) {
                "L" -> if (x > gridMin) x--
                "R" -> if (x < gridMax) x++
                "U" -> if (y > gridMin) y--
                "D" -> if (y < gridMax) y++
            }
        } else if (input.equals("Q", ignoreCase = true)) {
            println("[$x, $y]")
            break
        } else {
            println("Invalid move. Please enter 'U', 'D', 'L', 'R', or 'Q' to quit.")
        }
    }
}
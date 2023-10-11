/*
3. Nekonečný priestor
Klasickým problémom pri programovaní top-bottom počítačových hier je určovanie pozície panáčikov na nekonečnej hracej doske. Viete zistiť, kde sa bude panáčik nachádzať po vykonaní série krokov na takejto nekonečnej mriežke?
Majme postavičku vloženú do nekonečnej 2D mriežky na súradnici [5, 5]. Súradnicový systém funguje ako je znázornené na obrázku 1, teda bod 0,0 je v ľavom hornom rohu obrazovky.
 */

fun main() {
    val validMoves = listOf("L", "R", "U", "D")
    var x = 5
    var y = 5

    while (true) {
        val input = readlnOrNull()?.uppercase()
        if (input in validMoves) {
                when (input) {
                    "L" -> x--
                    "R" -> x++
                    "U" -> y--
                    "D" -> y++
                }
        } else if (input.equals("Q", ignoreCase = true)) {
            println("[$x, $y]")
            break
        } else {
            println("Invalid move. Please enter 'U', 'D', 'L', 'R', or 'Q' to quit.")
        }
    }
}

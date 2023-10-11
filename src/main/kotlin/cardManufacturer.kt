/*
6. Vydavateľ karty
V každom čísle, ktoré používateľ bežne nemá dôvod čítať, je ukrytá nejaká zvláštna informácia. Napríklad sa zamyslime nad takým číslom bankovej (kreditnej/debetnej) karty. Bankové karty vyrábajú rôzni vydavatelia. Pre nás sú najznámejšie karty VISA a MasterCard. Avšak poznať by sme mohli aj AmericanExpress, Discover, či Maestro. Prvých pár čísel nám vie presne povedať, kto danú kartu vyrobil.
 */

fun getCardManufacturer(cardNumber: String): String {
    return when {
            cardNumber.startsWith("4") -> "Visa"
            cardNumber.substring(0, 2) in "51".."55" || cardNumber.substring(0, 4) in "2221".."2720" -> "Mastercard"
            else -> "Unknown card"
        }

}

fun main() {
    val inputCard = readlnOrNull()?.trim() ?: ""
    val cardType = getCardManufacturer(inputCard)
    println(cardType)
}

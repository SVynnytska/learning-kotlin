package intro

import java.time.LocalDate

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "unknown"
}

fun recognize(s: String) = when (s) {
    in "aa".."az" -> "'a' range"
    in "ba".."bz" -> "'b' range"
    else -> "unknown"
}

fun main() {
    println(isNotDigit('x'))
    println(isNotDigit('1'))

    println(recognize('1'))
    println(recognize('x'))
    println(recognize('A'))
    println(recognize('$'))

    println(recognize("ay"))
    println(recognize("bx"))
    println(recognize("x"))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))

    val startDate = LocalDate.of(2020, 1, 1)
    val endDate = LocalDate.of(2020, 12, 31)
    val now = LocalDate.now()
    if (now in startDate..endDate) print("Welcome to hell!") else println("You're alive")

    if (now >= LocalDate.of(2030, 1, 1)) println("Time after corona!")

}

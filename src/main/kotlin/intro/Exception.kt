package intro

import java.io.IOException

fun foo() {
    throw IOException()
}

@Throws(IOException::class)
fun bar() {
    throw IOException()
}

fun main() {
    println(percentage(100))

    val percentage1 = try {
        percentage(110)
    } catch (e: IllegalArgumentException) {
        null
    }
    println(percentage1)

    val percentage2 = try {
        percentage(110)
    } catch (e: IllegalArgumentException) {
        return
    }
    println(percentage2)
}

fun percentage(number: Int) =
    if (number in 0..100) number else throw IllegalArgumentException("A percentage value must be in 0..100: $number")

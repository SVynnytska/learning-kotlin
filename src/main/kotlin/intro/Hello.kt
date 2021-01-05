@file:JvmName("Util")

package intro

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${args.getOrNull(0)}!")
    println("Hello, ${args.getOrNull(0)}!")
    mutableListOf("Kotlin")
    listOf("kot")
    max(1, 2)

    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "{", postfix = "}"))
    println(listOf('a', 'b', 'c').joinToString(separator = "."))
    println(listOf('a', 'b', 'c').joinToString(prefix = "."))

    displaySeparator()
    displaySeparator('#')
    displaySeparator('#', 6)
    displaySeparator(size = 6)
    displaySeparator(size = 6, character = '#')

    println(sum(1))
    println(sum(1, 2, 4))

    println(isNotDigit('1'))
}

fun max(a: Int, b: Int) = if (a > b) a else b

@JvmOverloads
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

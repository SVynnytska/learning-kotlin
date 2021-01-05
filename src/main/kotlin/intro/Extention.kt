package intro


fun String.lastChar() = get(length - 1)

fun String.repeat(n: Int): String {
    val sb = StringBuilder(length * n)
    for (i in 1..n)
        sb.append(this)
    return sb.toString()
}

fun main() {
    println("123".lastChar())
    println("123".repeat(3))

    val q = """To code, 
        |or not to code
    """.trimMargin()

    val a =
        """
    Keep calm
    and learn Kotlin
    """.trimIndent()

    println(q)
    println(a)

    println("abc".get(1))
}

fun String.get(index: Int) = '*'


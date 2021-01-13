package nicestring


fun String.isNice(): Boolean {
    val notContainsBuBaBe = setOf("bu", "ba", "be").none { this.contains(it) }
    val containsEnoughVowels = count { it in "aeiou" } >= 3
    val containsEnoughDoubleLetter = this.zipWithNext().any { it.first == it.second }

    return listOf(
        notContainsBuBaBe,
        containsEnoughVowels,
        containsEnoughDoubleLetter
    ).count { it } >= 2
}

val foo: Int
    get() = java.util.Random().nextInt()

class A {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main() {
    A().display()
}

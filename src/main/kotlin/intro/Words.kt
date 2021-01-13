package intro

class Words {
    private val list = mutableListOf<String>()

    override fun toString() = list.toString()

    operator fun String.unaryPlus() = record()

    fun String.record() {
        list += this
    }
}

fun main() {
    val words = Words()
    with(words) {
        // The following two lines should compile:
        "one".record()
        + "two"
    }
    println(words.toString())
}

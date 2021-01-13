package intro

fun fibonacci(): Sequence<Int> = sequence {
    var element = Pair(0, 1)
    while (true) {
        yield(element.first)
        element = Pair(element.second, element.first + element.second)
    }
}

fun main() {
    print(fibonacci().take(7).toList())
}

package intro

fun main() {
    val list = listOf(11, 1, 4, 5)

    for (l in list)
        print(l)
    println()
    for ((i, v) in list.withIndex())
        print("[$i $v]")
    println()
    val map = mapOf(1 to "one", 2 to "two")
    for ((k, v) in map)
        print("[$k $v]")
    println()
    for (i in 1..10)
        print(i)
    println()
    for (i in 1 until 10)
        print(i)
    println()
    for (i in 10 downTo 0 step 2)
        print(i)
    println()

    for (ch in "abXYzZ")
        print(ch + 1)
    println()

    for (c in '0' until '9')
        print(c)
    println()
}

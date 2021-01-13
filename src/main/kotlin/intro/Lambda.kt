package intro

fun List<Int>.allNonZero() = all { it != 0 }
fun List<Int>.allNonZero1() = none { it == 0 }
fun List<Int>.allNonZero2() = !any { it == 0 }

fun List<Int>.containsZero() = any { it == 0 }
fun List<Int>.containsZero1() = !all { it != 0 }
fun List<Int>.containsZero2() = !none { it == 0 }

val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }
val containsZero2 = List<Int>::containsZero2

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(0, 1, 2)
    list2.allNonZero()
    list2.allNonZero1()
    list2.allNonZero2()
    list2.containsZero()
    list2.containsZero1()
    list2.containsZero2()

    isEven(42)

    run { println(isEven(21)) }
    println(isEven)
}


package intro

fun main(args: Array<String>) {
    val s1 = ""
    val s2: String? = null

    println(s2?.length)
    val length02 : Int? = s2?.length
    val length: Int = s2?.length ?: 0
    println(length02)
    println(length)

    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    val r1 = (a ?: 0) + c
    val r2 = (b ?: 0) + c
    println("$r1$r2")

//    s2!!

    println(s1 as? Int)
    println(b as? Int)
    println(a as Int?)
    println(a as? String)
    println(a as String?)
    println(a as String?)
}

fun String?.isEmptyOrNull() = this == null || this.isEmpty()

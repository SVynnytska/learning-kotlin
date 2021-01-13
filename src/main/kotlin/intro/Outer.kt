package intro

class Outer {
    class B {
        fun b() = this
    }

    inner class C {
        fun c() = this@Outer
    }
}

fun main() {
    println(Outer().C().c())
    println(Outer.B().b())
}

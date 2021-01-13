package intro

open class Parent {
    open val foo = 1

    init {
        println(foo)
    }
}

class Child : Parent() {
    override val foo = 2
}

open class A(open val value: String) {
    init {
        println(value.length)
    }
}

class B(override val value: String) : A(value)


data class Contact(val name: String, val address: String)

object KSingleton {
    fun foo() {}
}


fun main() {
    Child()
    //B("a")
    val contact = Contact("Kate", "Lviv")
    println(contact.copy(address = "Kyiv"))
    print(KSingleton.foo())

}


interface X {
    var first: Int
    var second: Int
    var third: Int
}

interface Y {
    fun start()
    fun finish()
}

interface Z {
    fun init()
}

fun foo(x: X, y: Y?, z: Z) {
    with(x) {
        first = 1
        second = 2
        third = 3
    }
    y?.run {
        start()
        finish()
    }
    val result = z.apply {
        init()
    }

}

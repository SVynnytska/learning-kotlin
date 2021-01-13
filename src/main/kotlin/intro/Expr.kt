package intro

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Int, val right: Int) : Expr()

fun eval(e: Expr) = when (e) {
    is Num -> e.value
    is Sum -> e.left + e.right
}


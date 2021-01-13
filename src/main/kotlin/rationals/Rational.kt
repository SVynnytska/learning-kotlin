package rationals

import java.math.BigInteger


@Suppress("DataClassPrivateConstructor")
data class Rational
private constructor(val numerator: BigInteger, val denominator: BigInteger) : Comparable<Rational> {

    companion object {
        fun create(numerator: BigInteger, denominator: BigInteger): Rational =
            normalize(numerator, denominator)


        private fun normalize(numerator: BigInteger, denominator: BigInteger): Rational {
            require(denominator != BigInteger.ZERO) { "Denominator must be not null" }
            val g = numerator.gcd(denominator)
            val sign = denominator.signum().toBigInteger()
            return Rational(numerator / g * sign, denominator / g * sign)
        }
    }

    override fun toString() = if (denominator == BigInteger.ONE) "$numerator" else "$numerator/$denominator"

    operator fun plus(other: Rational): Rational =
        create(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)

    operator fun minus(other: Rational): Rational =
        create(numerator * other.denominator - other.numerator * denominator, denominator * other.denominator)

    operator fun times(other: Rational): Rational =
        create(numerator * other.numerator, denominator * other.denominator)

    operator fun div(other: Rational): Rational =
        create(numerator * other.denominator, denominator * other.numerator)

    operator fun unaryMinus(): Rational = create(-numerator, denominator)

    override fun compareTo(other: Rational): Int =
        (numerator * other.denominator - other.numerator * denominator).signum()

}

infix fun Int.divBy(other: Int): Rational = Rational.create(toBigInteger(), other.toBigInteger())

infix fun Long.divBy(other: Long): Rational = Rational.create(toBigInteger(), other.toBigInteger())

infix fun BigInteger.divBy(other: BigInteger): Rational = Rational.create(this, other)

fun String.toRational(): Rational {
    fun String.toBigIntegerOrFail() = toBigIntegerOrNull()
        ?: throw IllegalArgumentException("Expecting rational in the form 'n/d' or 'n', " + "was '${this@toRational}")

    val number = split("/")

    return when (number.size) {
        1 -> Rational.create(number[0].toBigIntegerOrFail(), 1.toBigInteger())
        else -> Rational.create(number[0].toBigIntegerOrFail(), number[1].toBigIntegerOrFail())
    }
}

fun main() {
    val r1 = 1 divBy 2
    val r2 = 2000000000L divBy 4000000000L
    println(r1 == r2)

    println((2 divBy 1).toString() == "2")

    println((-2 divBy 4).toString() == "-1/2")
    println("117/1098".toRational().toString() == "13/122")

    println("1/2".toRational() - "1/3".toRational() == "1/6".toRational())
    println("1/2".toRational() + "1/3".toRational() == "5/6".toRational())

    println(-(1 divBy 2) == (-1 divBy 2))

    println((1 divBy 2) * (1 divBy 3) == "1/6".toRational())
    println((1 divBy 2) / (1 divBy 4) == "2".toRational())

    println((1 divBy 2) < (2 divBy 3))
    println((1 divBy 2) in (1 divBy 3)..(2 divBy 3))

    println(
        "912016490186296920119201192141970416029".toBigInteger() divBy
                "1824032980372593840238402384283940832058".toBigInteger() == 1 divBy 2
    )
}


package intro

import intro.Color.*

enum class Color {
    RED, GREEN, BLUE, INDIGO, YELLOW, ORANGE
}

fun getDescription(color: Color): String =
    when (color) {
        RED -> "hot"
        BLUE -> "cold"
        else -> "mild"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, RED) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun updateWeather(degrees: Int): Pair<String, Color> {
    val (description, color) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
    return Pair(description, color)
}

fun main() {
    print(updateWeather(6))
}

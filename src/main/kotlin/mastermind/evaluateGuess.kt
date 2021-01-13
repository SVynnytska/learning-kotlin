package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0

    var compareSecret = secret
    var compareGuess = guess

    for ((i, value) in secret.withIndex()) {
        when (value) {
            guess[i] -> {
                rightPosition++
                compareSecret = compareSecret.replaceFirst(value, '0') //
                if (guess[i] == compareGuess[i]) {
                    compareGuess = compareGuess.replaceFirst(value, '0')
                } else {
                    wrongPosition--
                }
            }
            else -> {
                wrongPosition += Integer.min(
                    compareSecret.count { it == value },
                    compareGuess.count { it == value })
                compareGuess = compareGuess.replace(value, '0')
            }
        }
    }

    return Evaluation(rightPosition, wrongPosition)
}

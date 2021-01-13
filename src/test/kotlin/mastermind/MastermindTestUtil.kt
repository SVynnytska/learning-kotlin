package mastermind

import org.junit.jupiter.api.Assertions

internal fun testEvaluation(first: String, second: String, positions: Int, letters: Int) {
    val evaluation = Evaluation(positions, letters)
    testEvaluationOneWay(secret = first, guess = second, expected = evaluation)
    testEvaluationOneWay(guess = second, secret = first, expected = evaluation)
}

internal fun testEvaluationOneWay(secret: String, guess: String, expected: Evaluation) {
    val evaluation = evaluateGuess(secret, guess)
    Assertions.assertEquals(expected, evaluation, "Wrong evaluation for secret=$secret, guess=$guess")
}

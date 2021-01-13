package games.gameOfFifteen

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class TestGameOfFifteenInitializer {
    @Test
    fun testInitialPermutationIsNotTrivial() {
        val initializer = RandomGameInitializer()
        Assertions.assertNotEquals(
            (1..15).toList(), initializer.initialPermutation, "The initial permutation must not be trivial"
        )
    }

    @Test
    fun testInitialPermutationIsEven() {
        val initializer = RandomGameInitializer()
        Assertions.assertNotEquals(
            isEven(initializer.initialPermutation), "The initial permutation must be even"
        )
    }
}

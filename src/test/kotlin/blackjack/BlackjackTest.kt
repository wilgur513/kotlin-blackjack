package blackjack

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class BlackjackTest {

    @ParameterizedTest
    @CsvSource(value = ["7, 8, 15", "6, 5, 11"])
    fun `카드의 합을 계산`(card1: String, card2: String, expect: Int) {
        val cards = Cards(card1, card2)

        val actual = cards.sum()

        assertThat(actual).isEqualTo(expect)
    }

    @Test
    fun `King은 10으로 계산`() {
        val cards = Cards("K", "5")

        val actual = cards.sum()

        assertThat(actual).isEqualTo(15)
    }

    @Test
    fun `Jack은 10으로 계산`() {
        val cards = Cards("J", "3")

        val actual = cards.sum()

        assertThat(actual).isEqualTo(13)
    }
}
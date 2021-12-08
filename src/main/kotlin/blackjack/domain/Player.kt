package blackjack.domain

class Player(val name: String) {
    private val _cards: Cards = Cards()
    val cards: Cards
        get() = _cards.deepCopy()
    val score: Score
        get() = _cards.score

    fun takeOneMoreCard(card: Card) = _cards.add(card)
    fun takeFirstTwoCard(cards: Cards) = cards.forEach(_cards::add)
    fun checkHaveAnAce() = _cards.haveAnAce()
    fun changeAceToEleven() = _cards.changeAceToEleven()
    override fun toString() = "$name"
}
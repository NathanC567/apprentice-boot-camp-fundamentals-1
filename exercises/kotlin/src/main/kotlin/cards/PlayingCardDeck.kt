package cards
class PlayingCardDeck(val cards: ArrayList<PlayingCard> = arrayListOf()): Deck {
    init {
        for (suit in Suit.values()) {
            for (faceValue in FaceValue.values()) {
                cards.add( PlayingCard(suit, faceValue))
            }
        }
    }

    override fun shuffle() {
        cards.shuffle()
    }

    override fun getCards(): MutableList<String> {
        val result = mutableListOf<String>()
        for (i in cards.indices) {
            val card = cards[i]
            result.add(card.toString())
        }
        return result
    }

    override fun deal(): Card {
        return cards.removeAt(0)
    }
}
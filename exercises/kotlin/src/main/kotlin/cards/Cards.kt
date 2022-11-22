package cards

class Cards {
    val cards: MutableList<String>
        get() {
            val result = MutableList(52) {""}
            val deck = PlayingCardDeck()
            for ((cardNumber, card) in deck.cards.withIndex()) {
                result[cardNumber] = "${card.faceValue.faceValueName} of ${card.suit.name.lowercase()}"
            }
            return result
        }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cards = Cards()
            val deckInOrder = cards.cards
            for (card in deckInOrder) {
                println(card)
            }
        }
    }
}
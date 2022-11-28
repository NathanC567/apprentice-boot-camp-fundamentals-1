package cards
class PlayingCardDeck(val playingCards: MutableList<PlayingCard> = mutableListOf()): Deck(playingCards as MutableList<Card>) {
    init {
        for (suit in Suit.values()) {
            for (faceValue in FaceValue.values()) {
                playingCards.add(PlayingCard(suit, faceValue))
            }
        }
    }
}
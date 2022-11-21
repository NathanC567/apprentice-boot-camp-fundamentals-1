package cards
class Deck(val deck: ArrayList<PlayingCard> = arrayListOf()) {
    init {
        for (suit in Suit.values()) {
            for (faceValue in FaceValue.values()) {
                deck.add( PlayingCard(suit, faceValue))
            }
        }
    }
}
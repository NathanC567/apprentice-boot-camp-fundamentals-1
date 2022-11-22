package cards

class PlayingCard(val suit: Suit, val faceValue: FaceValue): Card {
    override fun snap(otherCard: Card?): Boolean {
        otherCard as PlayingCard?
        return (otherCard != null) && faceValue == otherCard.faceValue
    }

    override fun toString(): String {
        return "${faceValue.faceValueName} of ${suit.name.lowercase()}"
    }
}
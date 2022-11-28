package cards

class PlayingCard(val suit: Suit, val faceValue: FaceValue): Card {
    override fun snap(otherCard: Card?): Boolean {
        if (otherCard?.javaClass != javaClass) return false
        otherCard as PlayingCard?
        return faceValue == otherCard.faceValue
    }

    override fun toString(): String {
        return "${faceValue.faceValueName} of ${suit.name.lowercase()}"
    }
}
package cards

internal class AnimalDeck: Deck {
    private val cards: MutableList<AnimalCard?>

    init {
        cards = ArrayList()
        for (animal in Animal.values()) {
            cards.add(AnimalCard(animal))
            cards.add(AnimalCard(animal))
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

    override fun deal(): AnimalCard? {
        return cards.removeAt(0)
    }
}
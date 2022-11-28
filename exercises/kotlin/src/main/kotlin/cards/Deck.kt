package cards

abstract class Deck (val deck: MutableList<Card>){
    fun shuffle(){
        deck.shuffle()
    }

    fun getCards(): MutableList<String> {
        val result = mutableListOf<String>()
        for (i in deck.indices) {
            val card = deck[i]
            result.add(card.toString())
        }
        return result
    }

    fun deal(): Card? {
        return deck.removeAt(0)
    }
}
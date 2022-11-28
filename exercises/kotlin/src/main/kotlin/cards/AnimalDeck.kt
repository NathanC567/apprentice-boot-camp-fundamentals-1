package cards

class AnimalDeck (val animalCards: MutableList<AnimalCard?> = mutableListOf()): Deck(animalCards as MutableList<Card>) {

    init {
        for (animal in Animal.values()) {
            animalCards.add(AnimalCard(animal))
            animalCards.add(AnimalCard(animal))
        }
    }


}
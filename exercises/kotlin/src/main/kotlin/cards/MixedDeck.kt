package cards

class MixedDeck constructor(playingCardDeck: PlayingCardDeck, animalDeck: AnimalDeck)
    : Deck((playingCardDeck.playingCards + animalDeck.animalCards) as MutableList<Card>)
package cards

class AnimalCard (val animal: Animal): Card {


    override fun snap(otherCard: Card?): Boolean {
        if (otherCard?.javaClass != javaClass) return false
        otherCard as AnimalCard?
        return animal == otherCard.animal
    }

    override fun toString(): String {
        return animal.toString()
    }
}


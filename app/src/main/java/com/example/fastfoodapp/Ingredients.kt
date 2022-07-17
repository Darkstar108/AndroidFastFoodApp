package ProjectWithDesignPatterns

// Defines Ingredient interface that will be implemented by some concrete Ingredients
interface Ingredient {
    abstract val name: String
    abstract val cost: Int

    fun displayIngredient() {
        println("Ingredient is $name and costs $cost")
    }
}

class Cheese: Ingredient {
    override val name: String = "Cheese"
    override val cost: Int = 20
}

class Tomato: Ingredient {
    override val name: String = "Tomato"
    override val cost: Int = 10
}

class Lettuce: Ingredient {
    override val name: String = "Lettuce"
    override val cost: Int = 15
}

class Chicken: Ingredient {
    override val name: String = "Chicken"
    override val cost: Int = 30
}
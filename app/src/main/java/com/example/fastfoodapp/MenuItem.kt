package ProjectWithDesignPatterns

// MenuItem will be the Component interface for the Composition of ComboMeals and Burgers
interface MenuItem {
    abstract val name: String
    fun displayNode()
}

// ComboMeal is a complex node that can contain other ComboMeals or Burgers all of which are stored as children
class ComboMeal(override  val name: String): MenuItem {
    private var children: MutableList<MenuItem> = ArrayList<MenuItem>()

    fun add(child: MenuItem) {
        children.add(child)
    }

    fun remove(child: MenuItem) {
        children.remove(child)
    }

    fun getChildren(): MutableList<MenuItem> {
        return children
    }

    fun getChild(index: Int): MenuItem {
        return children[index]
    }

    override fun displayNode() {
        println("$name")
        for(child in children) {
            child.displayNode()
        }
        println()
    }
}

// Burger is a leaf node that contains an array of Ingredients
class Burger(override val name: String): MenuItem {
    var ingredients: MutableList<Ingredient> = ArrayList<Ingredient>()

    // add ingredient, remove ingredient

    override fun displayNode() {
        println("$name")
        for(ingredient in ingredients) {
            ingredient.displayIngredient()
        }
    }

}

// Builder will have executeCommand where it can execute AddIngredientCommand and RemoveIngredientCommand and returnProduct
// Command will have object being built which will be used by concrete commands to execute on that object
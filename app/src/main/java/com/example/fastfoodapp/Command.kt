package ProjectWithDesignPatterns

// All commands will have access to MenuItem on which the command is being executed
interface Command {
    val menuItem: MenuItem
    fun execute()
}

class AddIngredientCommand(override val menuItem: Burger, val ingredient: Ingredient) : Command {
    override fun execute() {
        menuItem.ingredients.add(ingredient)
    }
}

class RemoveIngredientCommand(override val menuItem: Burger, val remIngredient: Ingredient) : Command {
    override fun execute() {
        val iterator = menuItem.ingredients.iterator()
        while(iterator.hasNext()) {
            val ingredient = iterator.next()
            if(ingredient.javaClass == remIngredient.javaClass) {
                iterator.remove()
                break
            }
        }
    }
}

class AddMenuItemCommand(override val menuItem: ComboMeal, val addedItem: MenuItem): Command {
    override fun execute() {
        menuItem.add(addedItem)
    }
}

class RemoveMenuItemCommand(override val menuItem: ComboMeal, val removeItemName: String): Command {
    override fun execute() {
        menuItem.getChildren().removeIf { it.name == removeItemName }
    }
}
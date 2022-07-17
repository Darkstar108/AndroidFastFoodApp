package ProjectWithDesignPatterns

// MenuItemBuilder is an abstract class that has executeCommand() which will used by both ComboMeal and Burger.
// Both implementations also have a create function to return a new ComboMeal or Burger
abstract class MenuItemBuilder {
    fun executeCommand(command: Command) {
        command.execute()
    }
}

class ComboMealBuilder: MenuItemBuilder() {
    fun createComboMeal(comboMealName: String): ComboMeal {
        val comboMeal = ComboMeal(comboMealName)
        return comboMeal
    }
}

class BurgerBuilder: MenuItemBuilder() {
    fun createBurger(burgerName: String): Burger {
        val burger = Burger(burgerName)
        return burger
    }
}
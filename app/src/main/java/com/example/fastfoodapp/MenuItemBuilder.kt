package ProjectWithDesignPatterns

// MenuItemBuilder is an abstract class that has executeCommand() which will used by both ComboMeal and Burger.
// Both implementations also have a create function to return a new ComboMeal or Burger
abstract class MenuItemBuilder {
    fun executeCommand(command: Command) {
        command.execute()
    }
}
//
//class ComboMealBuilder: MenuItemBuilder() {
//    fun createComboMeal(comboMealName: String, comboMealCost: Int, comboDesc: String): ComboMeal {
//        val comboMeal = ComboMeal(comboMealName, comboMealCost, comboDesc)
//        return comboMeal
//    }
//}

class BurgerBuilder: MenuItemBuilder() {
    fun createBurger(burgerName: String, burgerCost: Int, burgerDesc: String, image:String): Burger {
        val burger = Burger(burgerName, burgerCost, burgerDesc,image)
        return burger
    }
}

class PizzaBuilder: MenuItemBuilder() {
    fun createBurger(pizzaName: String, pizzaCost: Int, pizzaDesc: String, image:String): Pizza {
        val pizza = Pizza(pizzaName, pizzaCost, pizzaDesc,image)
        return pizza
    }
}
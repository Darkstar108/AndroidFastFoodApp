package com.example.fastfoodapp

// MenuItemBuilder is an abstract class that has executeCommand() which will used by both ComboMeal and Burger.
// Both implementations also have a create function to return a new ComboMeal or Burger
abstract class MenuItemBuilder {
    fun executeCommand(command: Command) {
        command.execute()
    }
}

//class ComboMealBuilder: MenuItemBuilder() {
//    fun createComboMeal(comboMealName: String, comboMealBasePrice: Int, comboDesc: String): ComboMeal {
//        val comboMeal = ComboMeal(comboMealName, comboMealBasePrice, comboDesc)
//        return comboMeal
//    }
//}

class BurgerBuilder: MenuItemBuilder() {
    fun createBurger(burgerName: String, burgerBasePrice: Int, burgerDesc: String): Burger {
        val burger = Burger(burgerName, burgerBasePrice, burgerDesc)
        return burger
    }
}

class PizzaBuilder: MenuItemBuilder() {
    fun createBurger(pizzaName: String, pizzaBasePrice: Int, pizzaDesc: String): Pizza {
        val pizza = Pizza(pizzaName, pizzaBasePrice, pizzaDesc)
        return pizza
    }
}
package com.example.fastfoodapp
//
//
//import com.example.fastfoodapp.PriceCalculatorVisitor
//
//fun main() {
////    val menu = ComboMeal("Menu")
////    val combo1 = ComboMeal("c1")
////    val combo2 = ComboMeal("c2")
////    val burger1 = Burger("b1")
////    val burger2 = Burger("b2")
////    val burger3 = Burger("b3")
////    menu.add(combo1)
////    menu.add(combo2)
////    combo1.add(burger1)
////    combo2.add(burger2)
////    combo2.add(burger3)
////    menu.displayNode()
//    val burgerBuilder = BurgerBuilder()
////    val comboMealBuilder = ComboMealBuilder()
////    val mainMenu= comboMealBuilder.createComboMeal("mainMenu")
////    val combo1 = comboMealBuilder.createComboMeal("c1")
////    val combo2 = comboMealBuilder.createComboMeal("c2")
//    // Create Burgers and add ingredients
//    val burger1 = burgerBuilder.createBurger("b1", 10, "desc1")
//    burgerBuilder.executeCommand(AddIngredientCommand(burger1, Cheese()))
//    burgerBuilder.executeCommand(AddIngredientCommand(burger1, Cheese()))
//    val burger2 = burgerBuilder.createBurger("b2", 10, "desc2")
//    burgerBuilder.executeCommand(AddIngredientCommand(burger2, Cheese()))
//    burgerBuilder.executeCommand(AddIngredientCommand(burger2, Tomato()))
//    val burger3 = burgerBuilder.createBurger("b3", 10, "desc3")
//    burgerBuilder.executeCommand(AddIngredientCommand(burger3, Lettuce()))
//    burgerBuilder.executeCommand(AddIngredientCommand(burger3, Chicken()))
//    // Add burgers to comboMeals
////    comboMealBuilder.executeCommand(AddMenuItemCommand(combo1, burger1))
////    comboMealBuilder.executeCommand(AddMenuItemCommand(combo1, burger2))
////    comboMealBuilder.executeCommand(AddMenuItemCommand(combo2, burger3))
////    comboMealBuilder.executeCommand(AddMenuItemCommand(mainMenu, combo1))
////    comboMealBuilder.executeCommand(AddMenuItemCommand(mainMenu, combo2))
////    mainMenu.displayNode()
//    val priceCalculatorVisitor = PriceCalculatorVisitor()
//    burger1.accept(priceCalculatorVisitor)
//    println(burger1.currentPrice)
//}
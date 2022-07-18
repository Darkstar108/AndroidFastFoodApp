package com.example.fastfoodapp

import java.util.*

// MenuItem will be the Component interface for the Composition of ComboMeals and Burgers
interface MenuItem {
    abstract val name: String
    abstract val basePrice: Int
    abstract var currentPrice: Int
    abstract val desc: String
    abstract val image: String
    fun displayNode()
}

// ComboMeal is a complex node that can contain other ComboMeals or Burgers all of which are stored as children
//class ComboMeal(
//    override  val name: String,
//    override val basePrice: Int,
//    override val desc: String
//    ): MenuItem, Visitible {
//
//    override var currentPrice: Int = basePrice
//    private var children: MutableList<MenuItem> = ArrayList<MenuItem>()
//
//    fun add(child: MenuItem) {
//        children.add(child)
//    }
//
//    fun remove(child: MenuItem) {
//        children.remove(child)
//    }
//
//    fun getChildren(): MutableList<MenuItem> {
//        return children
//    }
//
//    fun getChild(index: Int): MenuItem {
//        return children[index]
//    }
//
//    override fun displayNode() {
//        println("$name")
//        for(child in children) {
//            child.displayNode()
//        }
//        println()
//    }
//}

// Burger is a leaf node that contains an array of Ingredients
class Burger(
    override val name: String,
    override val basePrice: Int,
    override val desc: String
    ): MenuItem, Visitible {

    override var currentPrice: Int = basePrice
    var ingredients: MutableList<Ingredient> = ArrayList<Ingredient>()

    fun iterator(): BurgerIterator {
        return BurgerIterator()
    }

    inner class BurgerIterator: MutableIterator<Ingredient> {
        var currentIndex = 0 ;
        override fun hasNext(): Boolean {
            return  currentIndex < ingredients.size
        }

        override fun next(): Ingredient {
            return  ingredients[currentIndex++]
        }

        override fun remove() {
            ingredients.removeAt(--currentIndex)
        }

    }

    override fun displayNode() {
        println("$name")
        for(ingredient in ingredients) {
            ingredient.displayIngredient()
        }
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}

// Burger is a leaf node that contains an array of Ingredients
class Pizza(
    override val name: String,
    override val basePrice: Int,
    override val desc: String
    ): MenuItem, Visitible {

    override var currentPrice: Int = basePrice
    var ingredients: MutableList<Ingredient> = ArrayList<Ingredient>()

    fun iterator(): PizzaIterator {
        return PizzaIterator()
    }

    inner class PizzaIterator: MutableIterator<Ingredient> {
        var currentIndex = 0 ;
        override fun hasNext(): Boolean {
            return  currentIndex < ingredients.size
        }

        override fun next(): Ingredient {
            return  ingredients[currentIndex++]
        }

        override fun remove() {
            ingredients.removeAt(--currentIndex)
        }

    }

    override fun displayNode() {
        println("$name")
        for(ingredient in ingredients) {
            ingredient.displayIngredient()
        }
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}

// Builder will have executeCommand where it can execute AddIngredientCommand and RemoveIngredientCommand and returnProduct
// Command will have object being built which will be used by concrete commands to execute on that object
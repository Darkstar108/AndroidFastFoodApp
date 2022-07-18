package com.example.fastfoodapp

// Defines Ingredient interface that will be implemented by some concrete Ingredients
interface Ingredient {
    abstract val name: String
    abstract val cost: Int
    abstract val image: String

    fun displayIngredient() {
        println("Ingredient is $name and costs $cost")
    }
}

class Cheese: Ingredient {
    override val name: String = "Cheese"
    override val cost: Int = 20
    override val image: String = "https://img.icons8.com/emoji/256/cheese-wedge-emoji.png"

}

class Tomato: Ingredient {
    override val name: String = "Tomato"
    override val cost: Int = 10
    override val image: String = "https://img.icons8.com/emoji/256/cheese-wedge-emoji.png"

}

class Lettuce: Ingredient {
    override val name: String = "Lettuce"
    override val cost: Int = 15
    override val image: String = "https://cdn.imgbin.com/7/5/4/imgbin-romaine-lettuce-leaf-vegetable-salad-leaf-lettuce-vegetable-qWfNcPprFhU5BUx38M3L41MHU.jpg"

}

class Chicken: Ingredient {
    override val name: String = "Chicken"
    override val cost: Int = 30
    override val image: String = "https://png.pngtree.com/png-clipart/20211010/original/pngtree-roasted-chicken-breast-meat-roasted-meat-fried-food-container-meal-png-image_6850845.png"

}
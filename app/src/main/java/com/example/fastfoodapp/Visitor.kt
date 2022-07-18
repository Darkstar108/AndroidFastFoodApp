package com.example.fastfoodapp

interface Visitor {
    fun visit(burger: Burger)
    fun visit(pizza: Pizza)
}

interface Visitible {
    fun accept(visitor: Visitor)
}

class PriceCalculatorVisitor: Visitor {
    override fun visit(burger: Burger) {
        var dynamicPrice = 0
        val burgerIterator = burger.iterator()
        while(burgerIterator.hasNext()) {
            dynamicPrice = dynamicPrice + burgerIterator.next().cost
        }
        burger.currentPrice = burger.basePrice + dynamicPrice
    }

    override fun visit(pizza: Pizza) {
        var dynamicPrice = 0
        val burgerIterator = pizza.iterator()
        while(burgerIterator.hasNext()) {
            dynamicPrice = dynamicPrice + burgerIterator.next().cost
        }
        pizza.currentPrice = pizza.basePrice + dynamicPrice
    }

}
package designpatterns

interface Pizza {
    fun getPizza() : String
}

fun main() {
    val pizza = SweetCornDecorator(VegPizza()).getPizza()
    println(pizza)
    val pizza1 = CheeseDecorator(NonVegPizza()).getPizza()
    println(pizza1)
    val pizza2 = SweetCornDecorator(NonVegPizza()).getPizza()
    println(pizza2)
}
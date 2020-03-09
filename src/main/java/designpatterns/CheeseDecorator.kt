package designpatterns

class CheeseDecorator(var pizza : Pizza) : PizzaDecorator() {

    override fun getPizza(): String {
        return pizza.getPizza() + "  with Cheese !!!"

    }
}
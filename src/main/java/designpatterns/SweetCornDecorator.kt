package designpatterns

class SweetCornDecorator(var pizza : Pizza) : PizzaDecorator() {

    override fun getPizza(): String {
        return pizza.getPizza() + "  with SweetCorn !!!"

    }
}
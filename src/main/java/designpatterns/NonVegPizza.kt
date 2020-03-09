package designpatterns

class NonVegPizza : Pizza {
    override fun getPizza(): String {
        return "this is a nonveg Pizza"
    }
}
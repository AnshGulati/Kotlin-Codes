// Cannot be instantiated, must be subclassed
// Properties and functions marked with abstract must be overridden

// Similar to an interface with the added the ability to store state

abstract class Food
{
    abstract val kcal: Int
    abstract val name: String

    fun consume()
    {
        println("I am eating ${name} which has ${kcal} kcal")
    }
}

class Pizza(): Food()
{
    override val kcal: Int = 200
    override val name: String = "Pizza"
}

fun main() {
    val pizza = Pizza()
    pizza.consume()
}
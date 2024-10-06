// Kotlin has single-parent class inheritance
// Each class has exactly one parent class, called a superclass
// Each subclass inherits all members of its superclass including ones that the superclass itself has inherited

// Parent Class - Child Class
// Super Class - Sub Class
// Base Class - Derived Class
// General Class - Specific Class (Generalisation - Specialisation)

// Open Keyword is used
// Parent class constructor is called before Child class constructor

fun main()
{
    val c = SmartPhone()
    c.display()
    println(c.name)
    println(c.type)
    println(c.price)
}

open class Phone
{
    init {
        println("Parent's Constructor is called")
    }

    open val name: String = "Phone"
    open val type: String = "Keypad Phone"

    open fun display()
    {
        println("Simple Mobile Display")
    }
}

class SmartPhone: Phone()
{
    init {
        println("Child's Constructor is called")
    }

    override val name: String = "Samsung"
    override val type: String = "Touchscreen"
    val price: Int = 35000

    override fun display()
    {
        super.display()
        println("Samsung OLED Display")
    }
}
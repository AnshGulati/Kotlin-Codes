// Singleton objects can be used to implement an interface or inherit a class

fun main()
{
    // Anonymous Objects

    var obj1 = object : Cloneable
    {
        override fun clone()
        {
            println("I am a clone")
        }
    }

    var obj2 = object : PersonClass("John Doe")
    {
        override fun fullName() {
            super.fullName()
            println("Anonymous - ${name}")
        }
    }

    obj1.clone()
    obj2.fullName()
}

interface Cloneable
{
    fun clone()
}

open class PersonClass(val name: String)
{
    open fun fullName()
    {
        println("Full name : ${name}")
    }
}
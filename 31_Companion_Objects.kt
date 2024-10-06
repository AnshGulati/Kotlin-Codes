fun main()
{
    MyClass.display()
    MyClass.obj.display()
}

class MyClass
{
    object obj
    {
        fun display()
        {
            println("Hello I am object obj")
        }
    }

    // It is an object which shares everything with the class (just like a companion)
    // And obviously there can be only one companion
    companion object myObj
    {
        fun display()
        {
            println("Hello I am companion of MyClass")
        }
    }
}
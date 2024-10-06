// By default, everything is public in Kotlin (meaning you can even access it in another module or file
// Internal behaves like public but inside a same module (kotlin project is a module i.e. these 30 files are in same module)
// Private for top level declarations are accessible within the file
// Private within class will limit its scope within the class only
// Protected can't be used for top level declarations
// Protected for members within class will only be available to sub-classes

// Top Level declarations
private fun TopLevelFunction() = println("Hello") // Accessible within this file
// only protected is not allowed


open class ClassOne
{
    public var p = 10 // Accessible everywhere
    internal var q = 10 // Accessible within a module
    protected var r = 10 // Accessible to subclasses
    private var s = 10 // Accessible to only this class
}

class ClassTwo : ClassOne()
{
    fun test()
    {
        println(p)
        println(q)
        println(r)
        // println(s) // s is not accessible as it is private
    }
}
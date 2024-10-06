// No Parameter constructor
class A
{
    var num: Int = 12
}



// Parameter Constructor w/o var or val (Copy exists within scope of constructor)
class B (x: Int)
{
    val num1 = x+1
}


// Parameter Constructor with var or val (Copy exists in all instances of class)
class C (val y: Int)
{
    val num2 = y+1
}



// Default Parameters & Required Parameters Constructor
class Box(val length: Int, val breadth: Int = 20, val height: Int = 40)
{
    // Here breadth & height are def. whereas length is required parameter
    val area = length*breadth*height
}



// Primary Constructor or Initializer Block
class Square(val side: Int)
{
    init {
        println("This is called when object is created: area-> ${side*side}")
    }
}
// We can use constructor keyword instead of init but in first position
// Generally constructor keyword is used as secondary constructor after init
class Square2
{
    constructor(s: Int) {
        println("This is called when object is created: area-> ${s*s}")
    }
}




// Multiple constructors
class Circle(val radius: Double)
{
    // In Secondary constructors, body is not required
    // Secondary constructor calling primary constructor
    constructor(name: String) : this(1.0)
    constructor(diameter: Int) : this(diameter/2.0)
    {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI} * ${radius} * ${radius} = ${Math.PI * radius * radius}")
    }
}



fun main()
{
    // No Parameter constructor
    val a = A()



    // Parameter Constructor w/o var or val (Copy exists within scope of constructor)
    val b = B(12)
    // This 'x' will not be accessed, but we can access 'num'
    // println(b.x)
    println(b.num1)


    // Parameter Constructor with var or val (Copy exists in all instances of class)
    val c = C(12)
    println(c.y)
    println(c.num2)

    // Default Parameters & Required Parameters Constructor
    val box1 = Box(100, 20, 40)
    val box2 = Box(100)
    val box3 = Box(length = 100, breadth = 50, height = 60)
    println(box1.area)
    println(box2.area)
    println(box3.area)

    // Primary Constructor
    val sq = Square(10)
    val sq2 = Square2(5)

    // Multiple constructors
    val circle = Circle(3.0)
    val circle2 = Circle(4)
    val circle3 = Circle("jdnaind")

}
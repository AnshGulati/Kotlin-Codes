// Extension Functions

// Add functions to an existing class that you cannot modify directly
// Add functionality to classes that are not open

fun Int.isEven(): Boolean
{
    return this%2 == 0
}

// Higher Order Function - 1 (Passing a Function as a Parameter)
fun performOperation(x:Int, y:Int, operation: (Int,Int) -> Int) : Int
{
    return operation(x,y)
}

fun add(a:Int, b:Int) : Int { return a+b }
fun sub(a:Int,b:Int) : Int {return a-b}

// Higher Order Function - 2 (Return a Function)
fun getMultiplier(factor:Int) : (Int) -> Int
{
    return {number -> number * factor}
}

fun main() {

    // Extension Function
    println(2.isEven()) // true
    println(3.isEven()) // false


    // Higher Order Function - 1
    val resultAdd = performOperation(5,2,::add)
    val resultSub = performOperation(5,2,::sub)
    println(resultAdd) // 7
    println(resultSub) // 3


    // Higher Order Function - 2
    val multiplyBy2 = getMultiplier(2)
    println(multiplyBy2(4)) // 8

    // Higher Order Function - 3 (Lambda as Parameter)
    val result3 = performOperation(5,3) {a: Int,b: Int -> a*b}
    println(result3) // 15
}
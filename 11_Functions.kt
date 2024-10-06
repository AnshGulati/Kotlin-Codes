import kotlin.math.pow

// A block of code that performs a specific task
// Breaks a large program into smaller modular chunks
// Can take arguments with either named or default values

// Required Parameter
fun greeting(name: String)
{
    println("Hello ${name}")
}

// Inline Function
fun sum(num1: Int, num2: Int) = num1 + num2

// Default Parameter
fun printMessage(count: Int = 2)
{
//    count = 3 // You can't reassign value to these arguments as they are of type 'val'

    for(i in 1..count)
    {
        println("Hello ${i}")
    }
}

// Mix of required and default arguments
fun weather(str: String, temp: Int, isHot: Boolean, isLiveOnTV: Boolean = true)
{
    println("We are Live on TV: ${isLiveOnTV}")
    println("${str}, the temperature is ${temp}, Hence it is hot or not: ${isHot}.")
}

fun power(a:Double, b:Double): Double
{
    return a.pow(b)
}


fun main()
{
    greeting("Ansh")
    greeting("Piyush")

    println(sum(3,4))

    printMessage(5)

    // Will take default parameter value i.e. 2
    printMessage()

    // Named Parameters -> Used to improve readability
    weather(str="Currently in USA", temp=35, isHot = true)

    // Functions stored in Variables
    val raiseToPower = ::power
    print(raiseToPower(2.0,3.0))
}

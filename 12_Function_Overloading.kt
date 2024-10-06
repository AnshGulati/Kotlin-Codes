// Same name diff. parameters
// Either number of parameters is different or type is different.

fun addition(a:Int, b:Int): Int
{
    return a+b
}

fun addition(a:Double, b:Double): Double
{
    return a+b
}

fun main()
{
    println(addition(3,5))
    println( addition(3.5, 5.2))
}
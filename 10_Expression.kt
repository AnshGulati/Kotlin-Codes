//In Kotlin, almost everything is an expression and has a value.

// Even an if expression has a value.
fun main()
{
    val temp = 20
    val isHot = if(temp > 40) true else false
    println(isHot)

    // Sometimes, that value is kotlin.Unit.
    val isUnit = println("This is an expression")
    println(isUnit)
}
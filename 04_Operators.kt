//  Arithmetic operators: + - * / %
//  Increment and decrement operators: ++ --
//  Comparison operators: < <= > >=
//  Assignment operator: =
//  Equality operators: == !=
// Logical Operators: && || !

fun main()
{
    var num1 = 13
    var num2 = 2
    println(num1/num2) // 6
    
    // If one of the value is float then the result will also be in float
    println(num1.toFloat()/num2) // 6.5


    // Increment
    var i = 10
    // Post Increment (Increments after the opn.)
    println(i++) // 10
    // Pre Increment (Increments before the opn.)
    println(++i) // 12

    println(i++ + ++i) // 12 + 14 = 26


    // Numeric operator methods
    // Kotlin keeps numbers as primitives, but lets you call methods on numbers
    //as if they were objects.
    println(2.times(3)) // 6
    println(3.5.plus(4)) // 7.5
    println(2.4.div(2)) // 1.2
}
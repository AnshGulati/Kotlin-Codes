// A lambda is an expression that makes a function that has no name.

var dirtLevel = 20
val waterFilterLevel = {level:Int -> level/2} // Here level is parameter, Int is its type and level/2 is function body

// Syntax for Function Types
val waterFilter: (Int) -> Int = {level -> level/2} // Here (Int)->Int is Data type of variable (function type)

//print
fun main()
{
    val day = Day.Sunday
    println(day)
    day.printFormattedDay()

    val color = Color.RED
    println("${color} = (${color.r}, ${color.g}, ${color.b})")

    for(i in Day.entries)
    {
        println(i)
    }
}



// User Defined data type for a set of named values
// Basically it's a class of constant values

enum class Day()
{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday ;

    // Semicolon after the data then functions
    fun printFormattedDay()
    {
        println("Day is $this")
    }
}

// You can also define primary constructor parameters
enum class Color(val r: Int, val g: Int, val b: Int)
{
    RED(255,0,0),

    GREEN(0,255,0),

    BLUE(0,0,255)
}
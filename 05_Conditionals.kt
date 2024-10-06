fun main()
{
    val numberOfCups = 30
    val numberOfPlates = 50

    if (numberOfCups > numberOfPlates) {
        println("Too many cups!")
    } else {
        println("Not enough cups!")
    }

    val numberOfStudents = 50
    if(numberOfStudents in 1..100)
    {
        println(numberOfStudents)
    }

    val results = 36
    when(results)
    {
        0 -> println("No results")
        in 1..39 -> println("Got results!")
        else -> println("That's a lot of results!")
    }
}
// Lists are ordered collections of elements
// Elements can occur more than once in a list


fun main()
{
    // Immutable list using listOf()
    val instruments = listOf("trumpet", "piano", "violin")
    println(instruments)

    // Mutable list using mutableListOf()
    val myList = mutableListOf("trumpet", "piano", "violin")
    myList.remove("violin")
    println(myList)
}
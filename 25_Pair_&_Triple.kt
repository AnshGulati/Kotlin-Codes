// Pair and Triple are predefined data classes that store 2 or 3 pieces of data respectively
// Access variables with .first, .second, .third respectively

fun main()
{
    // Pair
    val bookAuthor = Pair("Harry Potter", "J.K. Rowling")
    println(bookAuthor)
    println(bookAuthor.second)

    // Triple
    val bookAuthorYear = Triple("Harry Potter", "J.K. Rowling", 1997)
    println(bookAuthorYear)
    println(bookAuthorYear.third)

    // You can also use 'to' variant instead of using Pair Keyword
    val bookAuthor1 = "Harry Potter" to "J.K. Rowling"
    println(bookAuthor1.second)

    // to is also used in collections like Map or HashMap
    val map = mapOf("name" to "Ansh", "SAP ID" to 500107055, "Student of UPES" to true)
    println(map)
}
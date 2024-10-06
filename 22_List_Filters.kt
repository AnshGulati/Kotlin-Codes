fun main()
{
    // EXAMPLE-1

    val nums = listOf(1,2,3,6,8)

    // Printing the filter
    println( nums.filter { it>2 }) // [3, 6, 8]

    // Storing it in another list
    var a:List<Int>? = null;
    a = nums.filter { it>2 }
    println(a) // [3, 6, 8]

    // Original List is not changed
    println(nums) // [1, 2, 3, 6, 8]


    // EXAMPLE-2

    val colors = listOf("red", "red-orange", "dark red", "orange", "bright orange", "saffron")
    println(colors.filter { it.contains("red") }) // [red, red-orange, dark red]

    // EXAMPLE-3

    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' }) // [biology, birds]




    // Eager (Filters are eager by default, A new list is created each time you use a filter)
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager) //  [viola, violin]

    // Lazy (occurs only if necessary at runtime
    // Sequences are data structures that use lazy evaluation, and can be used with filters to make them lazy.
    val filtered = instruments.asSequence().filter { it[0] == 'v'}
    println("filtered: " + filtered)

    // Sequences can be turned back into lists using toList()
    val newList = filtered.toList()
    println("new list: " + newList)


    // Map (performs the same transform on every item and returns the list)
    val numbers = listOf(1, 2, 3)
    println(numbers.map { it * 3 }) // [3, 6, 9]

    // flatten (returns a single list of all the elements of nested collections)
    val numberSets = listOf(setOf(1,2,3), setOf(4,5), setOf(1,2))
    println(numberSets.flatten()) // [1, 2, 3, 4, 5, 1, 2]
}

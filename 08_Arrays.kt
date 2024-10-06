fun main()
{
    // An array can also contain just one type (integers in this case).
    val numbers = intArrayOf(1, 2, 3)

    // String Array
    val arr: Array<String> = arrayOf("One", "Two", "Three")
    for (i in arr)
    {
        println(i)
    }

    // With Index
    for((i,e) in arr.withIndex())
    {
        println("The element at ${i} index is: ${e}")
    }

    // Access and modify elts by using get & set methods
    arr.set(0, "Hello")
    println(arr.get(0))

    println("Size of the array is: ${arr.size}")

    // An array can contain different types.
    val mix = arrayOf("hats", 2)

    val numbers1 = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val combined = numbers2 + numbers1
    println(combined.contentToString())

}
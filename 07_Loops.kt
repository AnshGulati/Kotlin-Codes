fun main()
{
    val pets = arrayOf("dog", "cat", "canary")
    for (element in pets) {
        println(element)
    }

    for((index, elt) in pets.withIndex())
    {
        println("Item at $index is $elt\n")
    }


    for (i in 1..5) println(i) // 12345

    for (i in 1 until 5) println(i) // 1234

    for (i in 5 downTo 1) println(i) //  54321

    for (i in 3..6 step 2) println(i) // 35

    for (i in 'd'..'g') println (i) // defg



    // While Loop
    var bicycles = 0
    while (bicycles < 50) {
        bicycles++
    }
    println("$bicycles bicycles in the bicycle rack\n")

    // Do-While Loop
    do {
        bicycles--
    } while (bicycles > 50)
    println("$bicycles bicycles in the bicycle rack\n")


    // Repeat Loop
    repeat(2) {
        println("Hello!")
    }


    }

fun main()
{
    // Safe call Operator
    var gender: String = "Male" // When it is a required field in the form
    var gender1: String? = null // When it is not a required field in the form
    var isAdult: Boolean? = true; // Can be false, true or even null

    // Testing for null
    if(gender1 != null)
    {
        println(gender1.toUpperCase())
    }

    // Instead of above we must use this:
    println(gender1?.toUpperCase())

    // throws nullPointerException when gender == null
    var correctvalue: String = gender!!.toUpperCase()
    println(correctvalue)

    // Elvis Operator
    // The value will be set equal to gender1 when not null, and if it is null, then the value will be "NA"
    var customvalue: String = gender1 ?: "NA"
    println(customvalue)
}
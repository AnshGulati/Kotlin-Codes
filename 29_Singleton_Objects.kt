// Object keyword is used for making object without defining a class
// These are single objects (singleton pattern), whereas through a class, you can define multiple objects
// No constructors are allowed since single object is created, but init block is allowed

fun main()
{
    println(One.num)
    Two.test()

    // Use Case
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()

    SharingWidget.incrementFacebookLikes()
    SharingWidget.incrementFacebookLikes()

    SharingWidget.display()

    // Object as an expression
    var testObj = object
    {
        val x: Int = 10
        fun method()
        {
            println("I am an object expression")
        }
    }

    testObj.method()
}

object One
{
    val num: Int = 10
}

object Two
{
    val p: Int = 20
    fun test()
    {
        println("I am object B")
    }
}

// Use of Singleton Objects
object SharingWidget
{
    private var twitterLikes = 0
    private var facebookLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFacebookLikes() = facebookLikes++
    fun display() = println("Facebook Likes: ${facebookLikes}, Twitter Likes: ${twitterLikes}")
}
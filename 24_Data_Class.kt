fun main()
{
    val p1 = People(1,"John")
    val p2 = People(1,"John")

    println(p1) // Returns a reference
    println(p2) // Returns a reference
    println(p1.hashCode()) // Returns a unique code
    println(p1 == p2) // FALSE, Since the reference is not equal i.e. the data may be same, but they are different objects

    println()
    println()

    // Data Class
    val pd1 = PeopleData(1,"John")
    val pd2 = PeopleData(1,"John")
    println(pd1) // Returns the data
    println(pd2) // Returns the data
    println(pd1.hashCode()) // Returns a unique code
    println(pd1 == pd2) // TRUE, Since the data is equal


    // Copy
    val pd3 = pd1.copy()
    println(pd3)
    val pd4 = pd1.copy(id=4)
    println(pd4)

    // Destructuring
    val (idOfpd1:Int, nameOfpd1: String) = pd1
    println(idOfpd1)
    println(nameOfpd1)

    println(pd1.component1())
}

// Normal Class
class People(val id: Int, val name:String)
{

}

// Data Class
data class PeopleData(val id: Int, val name:String)

// Data Class must have at least one primary constructor parameter
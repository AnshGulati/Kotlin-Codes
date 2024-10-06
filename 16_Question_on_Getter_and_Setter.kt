// Ques-1

// Create a custom getter method which takes two parameters first name and last name
// And returns a full name when we access full name variable

class Human(val firstName: String, val lastName: String)
{
    val fullName: String
        get() {
            return "$firstName $lastName"
        }
}


// Ques-2

// Create a custom getter and setter which takes one parameter full name
// and separates it to first name and last name

class Human2
{
    var firstName2: String = ""
    var lastName2: String = ""
    var fullName2: String = ""
        get() {
            return "First Name: ${firstName2} and Last Name: ${lastName2}"
        }
        set(value) {
            val components = value.split(" ")
            firstName2 = components[0]
            lastName2 = components[1]
            field = value
        }
}

fun main() {
    val h1 = Human("Ansh", "Gulati")
    println(h1.fullName)

    val h2 = Human2()
    h2.fullName2 = "Piyush Mangla"
    println(h2.fullName2)
}
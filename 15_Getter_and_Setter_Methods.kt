// The default getter returns the value of the property
// while the default setter assigns a new value to it

// But we can have our own custom getter and setter
// like here our when we do p1.name, we get Uppercase applied to it
// Whereas when we do p1.age, it sets the value only if the value is positive

class Person(nameParam: String, ageParam: Int)
{
    var name: String = nameParam
        get() {
            println("Name Getter is called")
            return field.toUpperCase()
        }

    var age: Int = ageParam
        set(value) {
            if(value > 0)
            {
                field = value
            }
            else
            {
                println("INVALID VALUE, Age can't be negative")
            }
        }
}

fun main() {
    val p1 = Person("ansh", 21)
    println(p1.name)
    println(p1.age)

    val p2 = Person("piyush", 4)
    println(p2.name)
    p2.age = -6 // This will not allow to set age value to be -6
    println(p2.age) // Hence this prints '4' instead of '-6'
}
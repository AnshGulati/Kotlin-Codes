// OOPs -> Object-Oriented Programming allows us to solve problems with the help of objects
// Object represents real world entities
// Classes are the blueprint or template for objects
// Classes define methods that operate on their object instances
// You create objects in your program and they interact with each other to complete the work

class House
{
    // Properties (Data)
    var houseColor: String = "white"
    var numberOfWindows: Int = 2
    var isForSale: Boolean = false



    // Methods (Behaviour)
    fun updateColor(newHouseColor: String)
    {
        houseColor = newHouseColor
    }

    fun putHouseOnSale(updatedIsForSale: Boolean)
    {
        isForSale = updatedIsForSale
    }
}

class Car(val carName : String, val carType : String, val kmRan :Int)
{
    fun driveCar()
    {
        println("Rohan is driving ${carName} which has 2 litres of ${carType} and a range of ${kmRan}")
    }

    fun parkCar()
    {
        println("Car is now in parked")
    }
}

fun main()
{
    val myHouse = House()
    println("Color of the house is: ${myHouse.houseColor}")
    println("Number of windows in the house are: ${myHouse.numberOfWindows}")
    println("House for sale or not: ${myHouse.isForSale}")

    myHouse.updateColor("Red")
    println("Color of the house updated to: ${myHouse.houseColor}")

    myHouse.putHouseOnSale(true)
    println("House on sale updated to: ${myHouse.isForSale}")

    println("\n")
    println("*******************************************************************************************")
    println("\n")

    val mustang = Car("mustang", "petrol", 100)
    val beetle = Car("beetle", "diesel", 200)

    println(mustang.driveCar())
    println(beetle.driveCar())
}
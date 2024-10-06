fun main()
{
    dragObjects(arrayOf(CircleShape(4.0), SquareShape(4.0), TriangleShape(2.0,3.0), MainPlayer("Ansh")))
}

// Polymorphism
fun dragObjects(objects: Array<Draggable>)
{
    for (obj:Draggable in objects)
    {
        obj.drag()
    }
}

interface Draggable
{
    fun drag() // By default abstract
}

abstract class Shape : Draggable
{
    abstract fun area() : Double
}

class CircleShape(val radius: Double) : Shape()
{
    override fun area(): Double
    {
        return Math.PI * radius * radius
    }

    override fun drag()
    {
        println("Circle is getting dragged")
    }
}

class SquareShape(val side: Double) : Shape()
{
    override fun area(): Double
    {
        return side * side
    }

    override fun drag()
    {
        println("Square is getting dragged")
    }
}

class TriangleShape(val base: Double, val height: Double) : Shape()
{
    override fun area(): Double
    {
        return 0.5 * base * height
    }

    override fun drag()
    {
        println("Triangle is getting dragged")
    }
}

class MainPlayer(val name: String) : Draggable
{
    override fun drag()
    {
        println("$name is dragging")
    }
}
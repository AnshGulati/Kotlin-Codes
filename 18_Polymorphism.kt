import java.awt.Shape

// Helps to write maintainable and extensible code
// Helps in interacting with objects via common interface

fun main() {
    val circle: PShape = PCircle(4.0)
    val square: PShape = PSquare(4.0)

    val shapes: Array<PShape> = arrayOf(PCircle(4.0), PSquare(4.0), PTriangle(3.0, 4.0))

    calculateAreas(shapes)
}

fun calculateAreas(shapes: Array<PShape>)
{
    for(shape in shapes)
    {
        println(shape.area())
    }
}

open class PShape
{
    open fun area(): Double
    {
        return 0.0
    }
}

class PCircle(val radius: Double): PShape()
{
    override fun area(): Double
    {
        return Math.PI * radius * radius
    }
}

class PSquare(val side: Double): PShape()
{
    override fun area(): Double
    {
        return side * side
    }
}

class PTriangle(val base: Double, val height: Double): PShape()
{
    override fun area(): Double
    {
        return 0.5 * base * height
    }
}
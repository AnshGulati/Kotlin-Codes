fun main()
{
    val circle = CircleShape2(4.0)
    val player = MainPlayer2("Ansh")

    val arr:Array<Draggable2> = arrayOf(circle, player)

    for(obj in arr)
    {
        if(obj is CircleShape2)
        {
            println(obj.area2())
        }
        else
        {
            (obj as MainPlayer2).sayMyName()
        }
    }
}

interface Draggable2
{
    fun drag2() // By default abstract
}

abstract class Shape2 : Draggable2
{
    abstract fun area2() : Double
}

class CircleShape2(val radius2: Double) : Shape2()
{
    override fun area2(): Double
    {
        return Math.PI * radius2 * radius2
    }

    override fun drag2()
    {
        println("Circle is getting dragged")
    }
}

class MainPlayer2(val name: String) : Draggable2
{
    override fun drag2()
    {
        println("$name is dragging")
    }

    fun sayMyName()
    {
        println("Hey, My name is Ansh Gulati")
    }
}
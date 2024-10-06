fun main()
{
    // Suppose we are playing a game in which user collects tiles and he gets points if he chooses the color tile
    // But there are two orange tiles i.e. one is color and one is fruit
    // Hence the user will only get points when he chooses the color

    val tile1: Tile = Orange("fruit", 0)
    val tile2: Tile = Orange("color", 5)
    val tile3: Tile = Red(10)

    val totalPoints: Int = arrayOf(tile1,tile2,tile3).sumBy()
    {
        when(it)
        {
            is Orange -> if(it.type == "color") it.points else 0
            is Red -> it.points
            else -> 0
        }
    }

    println("Total Points -> $totalPoints")
}

// sealed class is just like enum, i.e. there are only limited options/values that can be assigned
//  but there is one more thing i.e. states, it can have multiple states

sealed class Tile
class Orange(val type: String, val points: Int) : Tile()
class Red(val points: Int) : Tile()
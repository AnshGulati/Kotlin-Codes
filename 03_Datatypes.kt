fun main()
{
    // Type Inference - Kotlin automatically gives the type based on the value stored.

    var score = 5; // Gives Int as a datatype
    //    score = 1.14; GIVES AN ERROR (INT TO FLOAT)

    // Primitive Datatypes
    var lnum : Long = 12483723
    var num : Int = 12
    var snum : Short = 32766
    var bnum : Byte = 126;
    var temperature : Double = 89.47389739879
//    var ftemp : Float = 23.234342
    var isRaining : Boolean = true;
    var alphabet : Char = 'a';
    var greeting : String = "Hello World!";

    // Declare an Int and assign null to it using Safe Call Operator
    var numberOfBooks: Int? = null
}


import java.awt.Shape

class Rectangle(
val a :Double, // these are the constructor (Primary)
val b :Double

) : Shapes("Rectangle") {
    // Overloaded
    // How to create a secondary constructor in a class // this is like we are later giving it to the primary constructor
    constructor(a:Double) : this(a,a) // this refers to the primary constructor above and the two a refer to the variable in the secondary constructor meaning that the missing b will be replaced by an a automatically
    constructor(a:Int, b:Int) : this(a.toDouble(), b.toDouble()) // Note that this is how explicit casting works in kotlin and then the a and b that are being casted are those of the secondary constructor
    init{ // Note that the init is what the computer is expected to do initially when the class is called
        println("$name created with a = $a and b = $b")
    }
    override fun area() = a*b

    override fun perimeter() = 2*a + 2*b

    fun isSquare() = a==b
}
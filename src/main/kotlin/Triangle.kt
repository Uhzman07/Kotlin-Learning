import kotlin.math.sqrt

class Triangle(
    val a: Double, // we could also make a constructor variable private by using "private val: Double"
    val b: Double,
    val c: Double
) : Shapes("Triangle"){ // the ":" means that it is inheriting from a particular class so the constructor of that class has to be included

    init{
        println("$name created with a= $a, b= $b, c= $c") // now we can access the name constructor from the Sh
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")

    }
    override fun area() = sqrt((perimeter()/2) * (perimeter()/2 -a) * (perimeter()/2-b) * (perimeter()/2-c))

    override fun perimeter() = a+b+c

}
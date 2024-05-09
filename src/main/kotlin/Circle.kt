import kotlin.random.Random

// Exception
class NegativeRadiusException : Exception("The radius can't be negative")

class Circle (
    val radius: Double

): Shapes("Circle"){
    //val pi = 3.141592 // An initialization
    //private val specialPi = 3.14 // Since this has been made private, it can only be made visible in this class only

    // Easier way is a companion object which can store various things for the class
    companion object{ // the companion object allows us not to even have to create an instance of the class so we can use the class directly
        fun randomCircle() : Circle {
            val radius = Random.nextDouble(1.0, 10.0) // Random.nextDouble chooses a random value
            return Circle(radius)
        }
    }

    init{
        if(radius < 0){
            throw NegativeRadiusException() // This prints out the error message that we had associated with the exception created
        }
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")

    }
    override fun area() = radius * radius * ImportantNumbers.PI // This is from the objects
    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}
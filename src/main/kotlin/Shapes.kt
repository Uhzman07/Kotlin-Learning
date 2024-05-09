// For a super class that can also have its instance in the main class, we use open that is
// open class Shapes()

abstract class Shapes( // This is a super class but its instance cannot be created in the main class
    var name : String,
    // protected var type: String // If we had something like this, it means that it can only be accessed by the class and the classes inheriting from it only meaning that it cannot even be inherited from the main class
) { // Open means that the other classes can inherit from it and it is the super class
    // Secondary constructor for this class
    constructor (name: String , vararg dimensions: Double) : this(name) // This is like some additional constructors to the same class

    init{ // Note that since this is the super class anywhere the call the other classes inheriting from it, init bracket will be execute first
        println("I am the super class!!!")
    }


    abstract fun area() : Double // Abstract means we cannot create the instance of the class but it will belong to all the classes that are inheriting from it, to overcome this, the override keyword should be used before the similar function in the classes attached

    abstract fun perimeter() : Double // Note that we just decided to but ":Double in front because we want it to return a Double value and the other subclasses will do their own personal calculations"
    fun changeName(newName: String){
        name = newName

    }

}
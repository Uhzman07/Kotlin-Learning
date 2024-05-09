import java.awt.Rectangle
import java.lang.NumberFormatException
import java.util.Collections.list
//import kotlin.collections.EmptyList.indexOf

/*
fun main(){
   // println("Hello");
    //println("Whatsup");
    //var myVariable = 5
    //myVariable = 1
    //println("The value of my variable is: $myVariable")
    //val x = 3
    //val y = 6
    //val result = x + y
    //println(result)
    //println
    //val userInput = readLine()
    //println(userInput?.toUpperCase())// This converts the input to uppercase letters. The question mark there is used to check if its null
    //if(userInput!=null) // This firstly checks if the user Input is not null
      //println(userInput.toInt() - 5)
    /*
    val myString = "racecar"
    if(myString.reversed() == myString){ // .reversed() method returns the string from back to front
        println("The string $myString is a palindrome")
    }else{
        println("The string $myString is not a palindrome")
    }
     */
    /*
    val age= readLine()?.toInt() // This is the input and then it is converted to an integer

    when(age){ // This is like a switch statement this
        in 0..5 -> println("You are a young kid") // in here means range the two dots mean 0 to 5
        in 6..17 -> println("You are a teenager")
        18 -> println("Finally you are a 18")
        19,20 -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> ("You are really old")
    }

     */

    /*
    // To find the exponential value
    printPow(3,5) // We call the function

     */
    /*
    // To derive the values when we add from the given start to end we call our function
    additionOfNumbers(1,5) // call the addition function
     */

    /*
    println("Where are you from?")
    val country = readLine()

    when(country){
        "India" -> println("namaste")
        "USA" -> println("hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("privet")
        else -> println("I don't know that yet!")
    }
     */



}
 */

/*
// This is the function for deriving the exponential value
fun printPow(base:Int, exponent:Int){
    var result =1
    for(i in 1..exponent){ // this is a for loop from 1 to the value of the exponent entered
        result*=base
    }
    println("$base to the power of $exponent is $result")
}

fun printThreeLines(){
    println("First")
    println("Second")
    println("Third")

}
 */

/*
// Addition function
fun additionOfNumbers(start:Int, end:Int){
    var result = 0
    for(i in start..end){
        result+=i

    }
    println("The sum of the values from $start to $end is $result")

}
 */

/*
fun main(){
    var ourResult = printPow(2,5)  // Since it returns a value we can store in a variable
    println("Our result is $ourResult")

}
fun printPow(base:Int, exponent:Int):Int{ // Not that the Int at the end of the bracket is the data type for the return value

    var result = 1
    for(i in 1..exponent){
        result*=base
    }
    return result
    println("The result!!") // Note that in a function where we have a return value, any other thing after will be ignored
}

 */
/*
fun main(){
    val result = multiply(2,5)
    println(result)


}
fun multiply(a: Int, b: Int)= a*b // This is the result output
 */
/*
fun main(){
    val list = listOf(1,2,3)
    printFirstItem(list)

}
fun printFirstItem(list: List<Int>)= println(list[0]) // Note that List<Int> specifies the data type which is Int and the <> specifies that it is an array
 */

/*
fun main(){
    val list = listOf(3,4,5,4,2,4,5,6,7,2,1,9,8)
    println("Please select a value between $list to select")
    val result = getTheValue(list)
    //println("The index of $req  you just  selected is $result")
    println(result)


}

fun getTheValue(list:List<Int>): String { // the Int specification at the end represents the return data type
    val input = readLine()
    var counter = 0
    var required = input?.toInt() // not that whenever we are converting from string to integer we must assign it to a variable
    for (i in 0..list.size){ // list.size represents the length
        if (list[i] != required){
            counter++
        }
        else{
            break
        }

    }
    var word = "The index of value $required is $counter !!"
    return word
}
*/

// To get the maximum number
/*
fun main(){
    val array = intArrayOf(10,20,37,58)
    val max = getMax(1,2,4,5,6,7,8,9,*array,15,19) // note that *array inserts the whole value in the array at the same time
    println("The maximum is $max")

}
fun getMax(vararg numbers : Int) :Int {
    var max = numbers[0]
    for(number in numbers){ // Note that the variable number will traverse through the numbers array selecting one by one
        if(number>max){
            max = number
        }

    }
    return max

}

 */
/*
fun main(){
    searchFor("How to become a good programmer") // Note that this takes the default search engine
    searchFor("How to be the best kotlin programmer", "Bing") // But this is overrides the search engine
}
fun searchFor(search:String, searchEngine:String = "Google"){ // Note that the search engine parameter is Google by default
    println("Searching for '$search' on $searchEngine")

}

 */
/*
fun main(){
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("the alternating sum is $sum")

}

fun alternatingSum(vararg numbers: Int):Int{ // Alternating sum adds the first subtract the second and so on
    var count =0
    for(number in numbers){
        if(numbers.indexOf(number)% 2 ==0 ){
            count+=number
        }
        else{
            count-=number
        }

    }
    return count

}
 */
// To check prime numbers
/*
fun main(){
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input!= null){
        if(input.isPrime()){
            println("$input is a prime number")
        }
        else {
            println("$input is not a prime number")

        }
    }



}
fun Int.isPrime(): Boolean { // Note that the Int in from will represent the value we want to call the method with
    for(i in 2 until this -1){ // Note that this is used to refer to the Integer value that the method is been called upon
        if(this % i == 0 ){
            return false
        }
    }
    return true
}
 */
/*
// To multiply the values
fun main(){
    var result = multiplyNumbers(2,3,4,5,6)
    println("the result is $result")
}
fun multiplyNumbers(vararg numbers: Int): Int{
    var total =1;
    for (number in numbers){
        total*=number
    }
    return total
}
 */
/*
fun main(){
    val myRect = Rectangle(4.0,7.0)
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is Rectangle square? ${myRect.isSquare()}")

    val myCircle1 = Circle(5.0)
    val myCircle2 = Circle(7.0)
    
}

 */
/*
fun main(){
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("New Circle") // this function works with the change name function since Circle inherits from the Shapes class where the function is defined
    println(myCircle1.name)
    //println(myCircle1.pi) // This cannot be used since we have used the object class to store it
    //println(myCircle1.specialPi) // note that this shows an error since it has been made private in its class

    val myTriangle = Triangle(2.0,3.0, 5.0)
    myTriangle.changeName("New Triangle")
    println("The name of the triangle is ${myTriangle.name}")

    val rect = Rectangle(5.0) // This argument 5.0 replaces both a and b in the constructor

    // Over loading functions
    val circle = Circle(3.0)
    val triangle = Triangle(7.0, 7.0, 7.0)

    val maxAreaRectAndCircle = maxArea(rect,circle)
    val maxAreaRectCircleTriangle = maxArea(rect,circle,triangle)

    println("The maximum area of the rectangle and circle is $maxAreaRectAndCircle")
    println("The maximum area of the rectangle, the circle and the triangle is $maxAreaRectCircleTriangle")

    // For the companion object we can then have
    val circle1 = Circle.randomCircle()
    println(circle1)

    // To test the secondary constructor of the Shapes class
    // Anonymous class
    val a = 3.0
    val b = 4.0
    val height = 2.0
    // Since our Shapes class is abstract then we have to create an anonymous class for it then here, the variable "parallelogram" represents the entire class "Shapes"
    val parallelogram = object: Shapes("Parallelogram", a ,b , height){ // Note that this is a way of creating an anonymous class of shapes since the actual shapes class is abstract
        init{
            println("Parallelogram created with a= $a, b=$b and height =$height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }
        // We have to create the functions belonging to that anonymous class also
        override fun area(): Double{
            return a * height

        }

        override fun perimeter(): Double {
            return 2*a + 2*b

        }
        fun isRectangle() : Boolean = height == b // This is declared inside the anonymous class block since the class "parallelogram" already exists and can be accessed outside its block

    }

    println("Is the parallelogram a rectangle? ${parallelogram.isRectangle()}")
    // Note that if we run this it also prints out what is in the init block of the Shapes class and then does that of the anonymous class since the anonymous class is like a copy of the real class

    // We could also use the exception created using classes as an active exception
    val division = try{
        divide(5.0,0.0)
    } catch(e : DivisionByZeroException) { // Since this exception that has been created using classes is an active exception just as a built in exception, kotlin can recognize it
        0.0 // Instead of then printing the stated exception output the value that is assigned is 0.0
    }
    println("The result of the exception is $division")
    
    // To test the exception we had written using classes
    print(divide(5.0,0.0)) // Since we have our b as 0.0 when the exception is thrown, the message associated is shown with it in the console

    // Exceptions (Ctrl + Q for guide)
    //val input = readLine()?.toInt() // To prevent the throwing of exceptions in unsure cases
    // We can try this !!
    val input = try{ // The try allows it to do what it is supposed to do if the right criteria is met
        readLine()?.toInt()
    } catch (e : NumberFormatException){ // this is the exception that is caught that is, if we have a number exception like it not being the data type that we want
        // Note that there are numerous types of exception there we can just check through for the suitable one
        0 // This is important to prevent errors that is the value is set as the input whenever the right criteria is not met
    } finally{ // This is what is executed in all instances no matter what
        println("This is from the finally block")
    }
    println("You entered the $input")






}
// Exceptions continued, we can make an exception a class just to handle that from a function itself
class DivisionByZeroException : Exception("You cannot divide by zero. Please choose a different number")

fun divide(a:Double, b:Double) : Double{
    if(b== 0.0){
        throw DivisionByZeroException() // Our exception created using the class is thrown by printing out the exception sentence we had associate with it
    }
    return a/b
}

// Overloaded function
fun maxArea(shape1:Shapes, shape2:Shapes) : Double{ // Note that the parameters here are not associated to a data type but a general class which is the super class from which other inherited classes can derive from
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1  > areaShape2) areaShape1 else areaShape2

}

fun maxArea(shape1:Shapes, shape2: Shapes, shape3:Shapes) : Double{
    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
    val areaShape3 = shape3.area()
    return if(maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3


}

 */

// LAMBDA FUNCTION

fun main(){
    // For the TRIPLE which means storing various variables with different data types in one single variable
    var triple = Triple<Int, String, Boolean> (3, "hello", true) // The "Triple" keyword is in built used specify that we are about to put in three values with different data types
    // then to access each of them we can have
    var firstValue =triple.first // 3
    var secondValue = triple.second // "hello"
    var thirdValue = triple.third // true
    println(firstValue)
    println(secondValue)
    println(thirdValue)

    // For the one that is associated with the class (Custom triple created)
    var customTriple = CustomTriple<Int, String, Boolean>(3,"hello",true) // "<Int, String, Boolean>" now represent <A:Any , B:Any, C:Any> from the CustomTriple class
    customTriple.printTypes() // This prints the data type of the constructor variable that we had got from the CustomTriple class



    /*
    // Normal lambda function to filter out some un-matching digits
    // LAMBDA FUNCTION
    var list = (1..20).toList() // This makes the value that we had put in range to be a list that is 1 till 20
    println(list)
    list = list.filter{
        it % 2==0 // Note that this can also be like "it > 8" that is we only want the numbers that are greater than 8 in that list
    } // Note that the "it" here will refer to each number in that list so any number that does not return true with the criteria will be removed that is we want the numbers to be all even numbers
    println(list) // This then prints out the list after the numbers that are not even numbers had been removed

     */

    // Using the lambda function for filtering classes
    val circle1 =Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0,4.0,4.0)
    val triangle2 = Triangle(3.0,3.0,3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0,6.0)
    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)


    /*
    // Note that "filter" is the default lambda function to filter out unwanted ones while "customFilter" is the created one which does the same thing
    shapes = shapes.filter{ // so here since we have created our own lambda function which is ".customFilter"
        // we can therefore have "shapes = shapes.customFilter{shape -> shape.area()>20.0}" which will work in the same way
        // Above, "shape is the parameter while the condition after "->" is what is expected to be returned
        it.area() >20.0 // since the components of shape are all class instances, we can directly use a function in the class to check just like we have used the "area()" that belongs to each class of every instance that had been put in the shapes variable
        // Also, note that it here refers to each component in the variable shapes that is each class instance variable
    }.sortedBy { it.area() } // This then sorts the components of shapes by the value derive from the function "area()" that is they are sorted by the ascending order of the values
    for(shape in shapes){ // Since we have now removed the shape whose area might not be as great as 20.0 in the variables "shapes" now, the variable "shapes" consists of the required shapes instances only
        println("${shape.name} : Area = ${shape.area()}") // For the shapes that have passes the filter function we are going to derive the "name" property and then we are going to call the "area()" function on them
    }
     */



    // For the GENERIC function that is a simpler lambda function that can work with all data types like class instances, integers and also others using one lambda function only
    var integers = (1..10).toList().customFilter{it>5}// This is for a list of integer values


    shapes = shapes.customFilter { it.area() > 20.0 }
    for(shape in shapes){
        println("${shape.name}: Area = ${shape.area()}")

    }


}

/*
// To create our lambda function on our own just like the kotlin "filter{}" function this a normal lambda function works with the shapes subclasses instances only
// We will try to recreate filter lambda function
fun List<Shapes>.customFilter(filterFunction: (Shapes) ->(Boolean)): List<Shapes>{ // The ".customFilter" represents the normal kotlin .filter lambda function, we also have that the "filterFunction" variable has a "Shapes" data type that is the variable belongs to the super class shapes which is just like saying that such variable is a representation of "it" in the normal kotlin lambda function
  // The arrow "->" which returns a value means that it returns a value which is a boolean just like the normal lambda function then at the end, we have that the entire return type is a List of shapes "List<Shapes>"
    // Note that anytime we see "->" we know that the variable that had been stated is probably is a function on its own
    val resultList = mutableListOf<Shapes>() // Note that "mutableListOf" is a kotlin key word just like "listOf" which tells that the list is certainly changing
    for(shape in this){ // "this" here represents the entire List and "shape" represents the individual items in the list
        if(filterFunction(shape)){ // This is expected to return a Boolean value, then if it returns "true" the block code can be executed
            resultList.add(shape) // This is used to add an item in to the mutableListOf shapes
        }



    }
    return resultList // After all has been done this then returns only the items that had been added to the mutable list

}
 */

// ...................................................... GENERICS .........................................................
// For the GENERICS lambda function that works with the integers and the classes and all possible data types we can create a universal like data type

fun <T> List<T>.customFilter(filterFunction:(T) -> (Boolean)): List<T>{ // Note that the "T" here is a generic keyword used to specify all possible data types, it could also be "U" or any other one
    // This means a List of universal data types "T" has a lambda function "customFilter" which has an input whose data type is also universal then returns a boolean value always and then at the end we specify that the general data type of our result is a List<T> that is a list of universal data type
    val resultList = mutableListOf<T>() // This means that we are keeping a mutable list(of universal data type "<T>") of the list that we are trying to filter that is we are saying that the list is probably changing everytime
    for(item in this){ // "this" here refers to all the individual items in the universal list that we had created
        if(filterFunction(item)){ // Since the "filterFunction" returns a boolean value
            resultList.add(item) // We add the item that must have returned true into the mutable universal data list
        }
    }
    return resultList
}
// #### Note that this above will work with both the integers and the class instances since we are referring to a universal list that could work with integers, class instances and others

// To then make a generic lambda function work with a specified data type, we will have to give the generic data "T" a specified data type to work with from the beginning
/*

// Example 1
fun <T :Number> List<T>.customFilter(filterFunction: (T) -> Boolean):List<T>{ // We have specified that the data type of the generic "T" is an integer therefore we have that it will only work with Numbers that is integers, decimal and so on.

}
// This then will only work with
var integers = (1..10).toList().customFilter{it>5}// This is because the list data type is an integer which is then a Number as specified
 */

/*
// Example 2
fun <T :Shapes> List<T>.customFilter(filterFunction: (T) -> Boolean):List<T>{ // We have specified that the generic data type of "T" is "Shapes" because Shapes is a super class in our code which means that it contains all the subclasses that we might need

}
// This will only work with
var shapes = shapes.customFilter { it.area() > 20.0} // this is because the data type subclasses "shapes" been called all belong to the super class "Shapes"
 */


/*
// example to try to add a set of numbers using the lambda function
fun main(){
    val list = (1..10).toList()
    val sum = list.customSum{
        it%2==1 // we are trying to add the odd numbers only

    }
    println("The sum is $sum")
}
fun List<Int>.customSum(validToAdd:(Int) -> Boolean) : Int{ // "validToAdd" is function which we can manipulate to return a boolean value which is the same as "it%2==1" which returns true or false the ":Int" specifies that the final data type of the return value is an Integer
    var addition = 0
    for(number in this){ // To select each item in our list of numbers
        if(validToAdd(number)){ // if true
            addition+=number

        }

    }
    return addition
}


 */







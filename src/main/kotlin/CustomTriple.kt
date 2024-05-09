class CustomTriple<A:Any , B:Any, C:Any> ( // This is just like making "A", "B" and "C" act like data types on their own that is the "Any" means that they can be any data type
    // Any means that it is nullable that is like a variable that has just been declared with a universal data type
    var first: A, // these are the constructor variables for that class
    var second: B,
    var third: C

){
    fun printTypes(){
        println("The type of the first is ${first::class}") // the "::" is used to bring out the data type of "first"
        println("The type of the second is ${second::class}") // the "::" is used to bring out the data type of "second"
        println("The type of the third is ${third::class}") // the "::" is used to bring out the data type of "third"
    }


}
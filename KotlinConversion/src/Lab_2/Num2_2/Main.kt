package Lab_2.Num2_2

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>) {
    val xBool = true
    val xByte: Byte = 1
    val xShort: Short = 10
    val xInt: Int = 100
    val xLong = 1000L
    val xFloat = 10.0F
    val xDouble = 10.1
    val xChar = 'a'
    val xString: String = "Fake News"

    whatIsThisObject(xBool)
    whatIsThisObject(xByte)
    whatIsThisObject(xShort)
    whatIsThisObject(xInt)
    whatIsThisObject(xLong)
    whatIsThisObject(xFloat)
    whatIsThisObject(xDouble)
    whatIsThisObject(xChar)
    whatIsThisObject(xString)
}
fun whatIsThisObject(X: Any) {
    if(X is Boolean) {
        println("This is a boolean.")
    } else if(X is Byte) {
        println("This is a byte.")
    } else if(X is Short) {
        println("This is a short.")
    } else if(X is Int) {
        println("This is an integer.")
    } else if(X is Long) {
        println("This is a long.")
    } else if(X is Float) {
        println("This is a float.")
    } else if(X is Double) {
        println("This is a double.")
    } else if(X is Char) {
        println("This is a character.")
    } else {
        println("Interface don't know what that is.")
    }
}
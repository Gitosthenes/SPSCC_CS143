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

fun whatIsThisObject(x: Any) {
    when(x) {
        is Boolean -> println("This is a boolean.")
        is Byte -> println("This is a byte.")
        is Short -> println("This is a short.")
        is Int -> println("This is an integer.")
        is Long -> println("This is a long.")
        is Float -> println("This is a float.")
        is Double -> println("This is a double.")
        is Char -> println("This is a character")
        else -> {
            println("I don't know what that is.")
        }
    }
}
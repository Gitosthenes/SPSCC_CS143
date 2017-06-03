package Lab_1

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>){
    val X = MySquare(5.0)
    println("A square with sides of length "
            +X.getSideLength()+" has an area of "
            +X.getArea()+".")
}
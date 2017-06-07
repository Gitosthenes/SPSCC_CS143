package Lab_1

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
class MySquare(input: Double) {
    var length: Double = input
    fun getArea(): Double {
        return length * length
    }
    fun getSideLength(): Double {
        return length
    }
}
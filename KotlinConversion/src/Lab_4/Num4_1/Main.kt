package Lab_4.Num4_1

/**
 * Created by Alex Bledsoe, 6/3/2017.
 */
fun main(args:Array<String>) {
    println("value     tri value\n" +
            "===================")
    for (i in 1..10) {
        when(i) {
            in 1..9 -> println("  $i          ${triangle(i)}")
            else -> {
                println("  $i         ${triangle(i)}")
            }
        }
    }
}

fun triangle(n: Int): Int {
    if(n == 1) {
        return 1
    } else {
        return n + triangle(n - 1)
    }
}
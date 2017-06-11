package Lab_5.Num5_4

import java.util.*

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val Q: Queue<String> = ArrayDeque<String>()
    val sc = Scanner(System.`in`)
    println("How many elements in the queue?")
    val num = sc.nextInt()
    println("Enter the elements:")
    repeat(num) {
        Q.add(sc.next())
    }
    val doubleQ = doubleQueue(Q)
    for (s: String in doubleQ) {
        print("$s ")
    }
}

fun doubleQueue(Q: Queue<String>): Queue<String> {
    val doubleQ: Queue<String> = ArrayDeque<String>()
    while (Q.isNotEmpty()) {
        doubleQ.add(Q.peek())
        doubleQ.add(Q.poll())
    }
    return doubleQ
}
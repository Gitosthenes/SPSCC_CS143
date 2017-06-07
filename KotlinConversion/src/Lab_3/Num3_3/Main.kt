package Lab_3.Num3_3

import java.util.*

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args: Array<String>) {
    //3.1:
    val arr = intArrayOf(5, 2, 3, 8, 1, 7, 2, 7, 9, 2, 1)
    val dLL1 = LinkedList<Int>()
    for (e in arr) {
        dLL1.add(e)
    }
    //3.2:
    println("DLL1 is:\n$dLL1\n")
    //3.3:
    val dLL2 = LinkedList<Int>()
    while (dLL1.isNotEmpty()) {
        dLL2.add(dLL1.removeFirst())
    }
    //3.4:
    println("DLL2 is:\n$dLL2\n")
    //3.5:
    val dLL3 = LinkedList<Int>()
    while (dLL2.isNotEmpty()) {
        when (dLL2.last()) {
        //3.5.1:
            2 -> dLL3.addFirst(dLL2.removeLast() + 3)
        //3.5.2:
            7 -> dLL3.addFirst(dLL2.removeLast() - 1)
            else -> {
                dLL3.addFirst(dLL2.removeLast())
            }
        }
    }
    //3.6:
    println("DLL3 is:\n$dLL3")
}
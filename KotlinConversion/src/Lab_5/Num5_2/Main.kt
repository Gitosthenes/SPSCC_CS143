package Lab_5.Num5_2

import java.util.*

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val stack = Stack<Char>()
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    for (c: Char in input) {
        stack.push(c)
    }
    while (stack.isNotEmpty()) {
        print("${stack.pop()} ")
    }
}
package Lab_5.Num5_5

import java.util.*

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    if (isIllegal(input)) {
        println("Invalid")
    } else {
        println("Valid")
    }
}

fun isIllegal(input: String): Boolean {
    val stack = Stack<Char>()
    for (s: Char in input) {
        if (s == '(') {
            stack.push(s)
        } else if (s == ')') {
            if (stack.isEmpty()) {
                return true
            } else {
                stack.pop()
            }
        }
    }
    return stack.isNotEmpty()
}
package Lab_2.Num2_5

import java.util.*

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>) {
    val sc = Scanner(System.`in`)
    val cost = sc.nextDouble()
    val paid = sc.nextDouble()
    val diff: Double = (Math.round((paid-cost)*100)/100).toDouble()
    var count: Int = 0

    if(diff < 0) {
        println("You didn't pay enough.")
    } else {
        println("You bought something worth $cost")
        println("You paid $paid")
        println("================================")
        println("Your change is:")
        while(diff >= 1) {
            diff - 1
            count + 1
        }
        println("  $count dollar coins")
        count = 0
        while(diff >= 0.25) {
            diff - 0.25
            count + 1
        }
        println("  $count quarters")
        count = 0
        while(diff >= 0.1) {
            diff - 0.1
            count + 1
        }
        println("  $count dimes")
        count = 0
        while(diff >= 0.05) {
            diff - 0.05
            count + 1
        }
        println("  $count nickels")
        println("  ${diff/0.01} pennies")
    }
}
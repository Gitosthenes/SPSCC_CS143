package Lab_2.Num2_5

import java.text.DecimalFormat
import java.util.*

/**
 * Created by Alex Bledsoe, 6/2/2017.
 */
fun main(args:Array<String>) {
    //Scanner and DecimalFormat objects.
    val sc = Scanner(System.`in`)
    val df = DecimalFormat("0.00")
    //Get input and calculate change
    println("Enter the cost of the item:")
    val cost = sc.nextDouble()
    println("Enter the amount paid:")
    val paid = sc.nextDouble()
    var diff = df.format(paid - cost).toDouble()
    var count: Int = 0

    if(diff < 0) {
        println("You didn't pay enough.")
    } else {
        println("You bought something worth ${df.format(cost)}")
        println("You paid ${df.format(paid)}")
        println("================================")
        println("Your change is:")
        while(diff >= 1) {
            diff--
            count++
        }
        println("  $count dollar coins")
        count = 0
        while(diff >= 0.25) {
            diff -= 0.25
            count++
        }
        println("  $count quarters")
        count = 0
        while(diff >= 0.1) {
            diff -= 0.1
            count++
        }
        println("  $count dimes")
        count = 0
        while(diff >= 0.05) {
            diff -= 0.05
            count++
        }
        println("  $count nickels")
        println("  ${Math.round(diff/0.01)} pennies")
    }
}
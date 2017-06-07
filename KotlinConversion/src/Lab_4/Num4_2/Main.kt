package Lab_4.Num4_2

import java.util.*

/**
 * Created by Alex Bledsoe, 6/3/2017.
 */
fun main(arg: Array<String>) {
    //Test arrays
    val test1: IntArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    val test2: IntArray = intArrayOf(3,5,7,9)
    val test3: IntArray = intArrayOf(2,4,6,8,12)
    //Testing for values in 1st test array
    println("Searching array: ${Arrays.toString(test1)}\n")
    println("Value: 5\nIndex: ${binarySearch(5, test1)}\n")
    println("Value: 9\nIndex: ${binarySearch(9, test1)}\n")
    println("Value: 0\nIndex: ${binarySearch(0, test1)}\n")
    println("Value: 10\nIndex: ${binarySearch(10, test1)}\n")
    //Testing for values in 2nd test array
    println("Searching array: ${Arrays.toString(test2)}\n")
    println("Value: 2\nIndex: ${binarySearch(2, test2)}\n")
    println("Value: 3\nIndex: ${binarySearch(3, test2)}\n")
    println("Value: 9\nIndex: ${binarySearch(9, test2)}\n")
    //Testing for values in 3rd test array
    println("Searching array: ${Arrays.toString(test3)}\n")
    println("Value: 2\nIndex: ${binarySearch(2, test3)}\n")
    println("Value: 12\nIndex: ${binarySearch(12, test3)}\n")
    println("Value: 10\nIndex: ${binarySearch(10, test3)}\n")
    println("Value: -5\nIndex: ${binarySearch(-5, test3)}")
}

fun binarySearch(target: Int, arr: IntArray): Int {
    return binarySearch(target, arr, 0, arr.size-1)
}

fun binarySearch(target: Int, arr: IntArray, min: Int, max: Int): Int {
    if(min > max) {
        return -1
    }
    val mid: Int = (max+min)/2
    if (arr[mid] > target) {
        return binarySearch(target, arr, min, mid-1)
    } else if (arr[mid] < target) {
        return binarySearch(target, arr, mid+1, max)
    }
    return mid
}
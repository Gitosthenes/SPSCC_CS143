/**
 * Created by Alex Bledsoe, 6/3/2017.
 */
var COUNT: Int = 0

fun main(args: Array<String>) {
    val arr: IntArray = IntArray(100)
    for(i in 0..99) {
        arr[i] = i
    }
    val testTargets: IntArray = intArrayOf(5,10,17,20,25,50,83, arr.size, -1)

    println("Testing search with an array of length ${arr.size}...")
    println("Testing linear search:")
    for (i: Int in testTargets) {
        COUNT = 0
        println("Linear search needed ${linearSearch(i, arr)} iterations to find $i.")
    }
    println("\nTesting binary search:")
    for (i in testTargets) {
        COUNT = 0
        println("Binary search needed ${binarySearch(i, arr)} iterations to find $i.")
    }
}

fun linearSearch(target: Int, array: IntArray): Int {
    if (COUNT == array.size) {
        return COUNT
    }
    if (array[COUNT] == target) {
        return COUNT
    } else {
        COUNT++
        return linearSearch(target, array)
    }
}

fun binarySearch(target: Int, array: IntArray):Int {
    return binarySearch(target, array, 0, array.size-1)
}
fun binarySearch(target: Int, array: IntArray, min: Int, max: Int): Int {
    if (min > max) {
        return ++COUNT
    }
    val mid: Int = (max + min)/2
    if (array[mid] > target) {
        COUNT++
        return binarySearch(target, array, min, mid-1)
    } else if (array[mid] < target) {
        COUNT++
        return binarySearch(target, array, mid+1, max)
    }
    return ++COUNT
}
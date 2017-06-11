package Lab_4.Num4_4_iterative

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */

fun main(arg: Array<String>) {
    val valueArray: IntArray = IntArray(100)
    for (i in 0..99) {
        valueArray[i] = i
    }
    val targetArray: IntArray = intArrayOf(5, 10, 17, 20, 25, 50, 83, valueArray.size, -1)

    println("Testing search with an array of length ${valueArray.size}...")
    println("Testing Linear Search:")
    for (i in targetArray) {
        val result = linearSearch(i, valueArray)
        if (result >= 0) {
            println("Linear search needed $result iterations to find $i.")
        } else {
            println("Linear search needed ${valueArray.size} iterations and FAILED to find $i.")
        }
    }
    println("\nTesting Binary Search:")
    for (i in targetArray) {
        val result = binarySearch(i, valueArray)
        if (result >= 0) {
            println("Binary search needed $result iterations to find $i.")
        } else {
            println("Binary search needed ${-result} iterations and FAILED to find $i.")
        }
    }
}

fun linearSearch(target: Int, array: IntArray): Int {
    var count = 0
    for (i in array) {
        if (target == array[i]) {
            return count
        } else {
            count++
        }
    }
    return -1
}

fun binarySearch(target: Int, array: IntArray): Int {
    var min = 0
    var max = array.size - 1
    var mid: Int
    var count: Int = 0

    while (min <= max) {
        mid = (min + max) / 2
        if (target == array[mid]) {
            return ++count
        } else if (target < array[mid]) {
            count++
            max = mid - 1
        } else if (target > array[mid]) {
            count++
            min = mid + 1
        }
    }
    return -count
}
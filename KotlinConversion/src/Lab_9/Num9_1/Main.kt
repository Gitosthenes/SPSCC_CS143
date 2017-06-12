package Lab_9.Num9_1

import java.util.*
import kotlin.collections.HashSet

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val count = intArrayOf(34,22,10,60,30,22)
    val unsortedSet = HashSet<Int>()
    try {
        (0 until 5).mapTo(unsortedSet) { count[it] }
        println("The unsorted set is: $unsortedSet")
        val sortedSet = TreeSet<Int>(unsortedSet)
        println("The sorted set is: $sortedSet")
        println("The first element of the set is: ${sortedSet.first()}")
        println("The last element of the set is: ${sortedSet.last()}")

        //1.1:
        println("\nUnsorted set contains 10?..${unsortedSet.contains(10)}")
        //1.2:
        println("Sorted set contains 5?..${sortedSet.contains(5)}")
        //1.3:
        println("Removing 10 from the unsorted set...")
        unsortedSet.remove(10)
        //1.4:
        println("Unsorted set still contains 10?..${unsortedSet.contains(10)}")
        //1.5:
        println("Adding 8 to the sorted set...")
        sortedSet.add(8)
        //1.6:
        println("Sorted set now contains 8?..${sortedSet.contains(8)}")
        //1.7:
        println("The unsorted set contains: $unsortedSet")
        //1.8:
        println("The sorted set contains: $sortedSet")
        //1.9:
        println("Adding all values from sorted set to unsorted set...")
        unsortedSet.addAll(sortedSet)
        //1.10:
        println("Unsorted Set: $unsortedSet")
        println("Sorted Set: $sortedSet")
    } catch (e: Exception) {}
}
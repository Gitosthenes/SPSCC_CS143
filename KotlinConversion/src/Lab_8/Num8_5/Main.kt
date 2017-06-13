@file:Suppress("NAME_SHADOWING")

package Lab_8.Num8_5

import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val arrays = ArrayList<IntArray>()
    val rand = Random()
    var start: Long
    var end: Long
    var duration: Long

    val a = IntArray(100)
    val b = IntArray(1000)
    val c = IntArray(10000)
    val d = IntArray(100000)
    val e = IntArray(1000000)

    arrays.add(a)
    arrays.add(b)
    arrays.add(c)
    arrays.add(d)
    arrays.add(e)

    for (i: IntArray in arrays) {
        println("Sorting array of size ${i.size}:")
//------------------------------------------------------------------
        //Insertion Sort:
        for (j in i.indices) {
            i[j] = rand.nextInt(1000000)+1
        }
        start = System.nanoTime()
        insertionSort(i)
        end = System.nanoTime()
        duration = (end-start)/2
        println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
        //Selection Sort:
        for (j in i.indices) {
            i[j] = rand.nextInt(1000000)+1
        }
        start = System.nanoTime()
        selectionSort(i)
        end = System.nanoTime()
        duration = (end - start)/1000
        println("Selection sort: $duration μs.")
//------------------------------------------------------------------
        //Merge Sort:
        for (j in i.indices) {
            i[j] = rand.nextInt(1000000)+1
        }
        start = System.nanoTime()
        mergeSort(i)
        end = System.nanoTime()
        duration = (end - start)/1000
        println("Merge sort: $duration μs.")
//------------------------------------------------------------------
        //Quick Sort:
        for (j in i.indices) {
            i[j] = rand.nextInt(1000000)+1
        }
        start = System.nanoTime()
        quickSort(i)
        end = System.nanoTime()
        duration = (end - start)/1000
        println("Quick sort: $duration μs.")
        for (i in a.indices) {
            a[i] = rand.nextInt(1000000)+1
        }
        println()
    }
}

fun insertionSort(array: IntArray) {
    for (j in 1 until array.size) {
        val key = array[j]
        var i = j - 1
        while((i > -1) && (array[i] > key)) {
            array[i + 1] = array[i]
            i--
        }
        array[i + 1] = key
    }
}

fun selectionSort(array: IntArray) {
    for (i in 0 until array.size-1) {
        var index = i
        (i+1 until array.size)
                .asSequence()
                .filter { array[it] < array[index] }
                .forEach { index = it }
        val smallerNum = array[index]
        array[index] = array[i]
        array[i] = smallerNum
    }
}

fun mergeSort(array: IntArray) {
    if (array.size > 1) {
        val q = array.size/2
        val leftArray = Arrays.copyOfRange(array,0,q-1)
        val rightArray = Arrays.copyOfRange(array,q,array.size-1)

        mergeSort(leftArray)
        mergeSort(rightArray)

        merge(array, leftArray, rightArray)
    }
}

fun merge(a: IntArray, l: IntArray, r: IntArray) {
    val totElem = l.size + r.size
    var i = 0
    var li = 0
    var ri = 0

    while (i < totElem) {
        if ((li < l.size) && (ri < r.size)) {
            if (l[li] < r[ri]) {
                a[i] = l[li]
                i++
                li++
            } else {
                a[i] = r[ri]
                i++
                ri++
            }
        } else {
            if (li >= l.size) {
                while (ri < r.size) {
                    a[i] = r[ri]
                    i++
                    ri++
                }
            }
            if (ri >= r.size) {
                while (li < l.size) {
                    a[i] = l[li]
                    i++
                    li++
                }
            }
        }
    }
}

fun quickSort(array: IntArray) {
    quickSort(array,0,array.size-1)
}

fun quickSort(array: IntArray, l: Int, r: Int) {
    val index = partition(array,l,r)
    if (l < index -1) {
        quickSort(array,l,index-1)
    }
    if (index < r) {
        quickSort(array,index,r)
    }
}

fun partition(array: IntArray, l: Int, r: Int): Int {
    var i = l
    var j = r
    val pivot = array[(l+r)/2]
    while (i <= j) {
        while (array[i] < pivot) {
            i++
        }
        while (array[j] > pivot) {
            j--
        }
        if (i <= j) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }
    return i
}

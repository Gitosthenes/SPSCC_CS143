package Lab_8.Num8_5

import java.util.*

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val rand = Random()
    var start: Long = 0
    var end: Long
    var duration: Long

    val a = IntArray(100)
    val b = IntArray(1000)
    val c = IntArray(10000)
    val d = IntArray(100000)
    val e = IntArray(1000000)

    //Sorting the 1st array:
//-----------------------------------------------------------------
    //Insertion Sort:
    println("Working on an array of length ${a.size}.")
    for (i in a.indices) {
        a[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    insertionSort(a)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
    //Selection Sort:
    for (i in a.indices) {
        a[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    selectionSort(a)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Selection sort: $duration μs.")
//------------------------------------------------------------------
    //Merge Sort:
    for (i in a.indices) {
        a[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    mergeSort(a)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Merge sort: $duration μs.")
//------------------------------------------------------------------
    //Quick Sort:
    for (i in a.indices) {
        a[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    quickSort(a)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Quick sort: $duration μs.")
    for (i in a.indices) {
        a[i] = rand.nextInt(1000000)+1
    }
/**===================================================================*/

    //Sorting the 2nd array:
//-----------------------------------------------------------------
    //Insertion Sort:
    println("\nWorking on an array of length ${b.size}.")
    for (i in b.indices) {
        b[i] = rand.nextInt(1000000)+1
    }
    insertionSort(b)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
    //Selection Sort:
    for (i in b.indices) {
        b[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    selectionSort(b)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Selection sort: $duration μs.")
//------------------------------------------------------------------
    //Merge Sort:
    for (i in b.indices) {
        b[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    mergeSort(b)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Merge sort: $duration μs.")
//------------------------------------------------------------------
    //Quick Sort:
    for (i in b.indices) {
        b[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    quickSort(b)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Quick sort: $duration μs.")
/**===================================================================*/

    //Sorting the 3rd array:
//-----------------------------------------------------------------
    //Insertion Sort:
    println("\nWorking on an array of length ${c.size}.")
    for (i in c.indices) {
        c[i] = rand.nextInt(1000000)+1
    }
    insertionSort(c)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
    //Selection Sort:
    for (i in c.indices) {
        c[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    selectionSort(c)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Selection sort: $duration μs.")
//------------------------------------------------------------------
    //Merge Sort:
    for (i in c.indices) {
        c[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    mergeSort(c)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Merge sort: $duration μs.")
//------------------------------------------------------------------
    //Quick Sort:
    for (i in c.indices) {
        c[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    quickSort(c)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Quick sort: $duration μs.")
/**===================================================================*/

    //Sorting the 4th array:
//-----------------------------------------------------------------
    //Insertion Sort:
    println("\nWorking on an array of length ${d.size}.")
    for (i in d.indices) {
        d[i] = rand.nextInt(1000000)+1
    }
    insertionSort(d)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
    //Selection Sort:
    for (i in d.indices) {
        d[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    selectionSort(d)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Selection sort: $duration μs.")
//------------------------------------------------------------------
    //Merge Sort:
    for (i in d.indices) {
        d[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    mergeSort(d)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Merge sort: $duration μs.")
//------------------------------------------------------------------
    //Quick Sort:
    for (i in d.indices) {
        d[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    quickSort(d)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Quick sort: $duration μs.")
/**===================================================================*/

    //Sorting the 5th array:
//-----------------------------------------------------------------
    //Insertion Sort:
    println("\nWorking on an array of length ${e.size}.")
    for (i in e.indices) {
        e[i] = rand.nextInt(1000000)+1
    }
    insertionSort(e)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Insertion sort: $duration μs.")
//------------------------------------------------------------------
    //Selection Sort:
    for (i in e.indices) {
        e[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    selectionSort(e)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Selection sort: $duration μs.")
//------------------------------------------------------------------
    //Merge Sort:
    for (i in e.indices) {
        e[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    mergeSort(e)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Merge sort: $duration μs.")
//------------------------------------------------------------------
    //Quick Sort:
    for (i in e.indices) {
        e[i] = rand.nextInt(1000000)+1
    }
    start = System.nanoTime()
    quickSort(e)
    end = System.nanoTime()
    duration = (end - start)/1000
    println("Quick sort: $duration μs.")
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
        for (j in i+1 until array.size) {
            if (array[j] < array[index]) {
                index = j
            }
        }
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

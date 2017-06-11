package Lab_6.Num6_2

import java.util.*

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val pq = PriorityQueue<Entry>()

    repeat(10) {
        val k = sc.nextInt()
        val v = sc.next()
        pq.add(Entry(k, v))
    }

    while (pq.isNotEmpty()) {
        println(pq.remove())
    }
}
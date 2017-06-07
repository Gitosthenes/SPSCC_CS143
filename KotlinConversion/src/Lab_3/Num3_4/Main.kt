package Lab_3.Num3_4

/**
 * Created by Alex Bledsoe, 6/3/2017.
 */
fun main(args:Array<String>) {
    val test1 = DoublyLinkedList<Int>()
    for (i in 1..7) {
        test1.addLast(i)
    }

    val test2 = DoublyLinkedList<Int>()
    for (i in 1..4) {
        test2.addLast(i)
    }

    val test3 = DoublyLinkedList<String>()
    test3.addLast("First")
    test3.addLast("Second")
    test3.addLast("Third")
    test3.addLast("Fourth")
    test3.addLast("Fifth")

    println("Finding the middle of this list:\n$test1")
    println("-> The middle value is: ${test1.findMiddle()}\n")

    println("Finding the middle of this list:\n$test2")
    println("-> The middle value is: ${test2.findMiddle()}\n")

    println("Finding the middle of this list:\n$test3")
    println("-> The middle value is: ${test3.findMiddle()}")
}
@file:Suppress("NAME_SHADOWING")

package Lab_7.Num7_4

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    //Create 1st Test Tree and traverse:
    println("Test Tree 1:\n---------------------------------------------")
    val a0 = TreeNode(10)
    val a1 = a0.addChild(6)
    val b1 = a0.addChild(18)
    a1.addChild(4)
    a1.addChild(8)
    b1.addChild(15)
    b1.addChild(21)
    preOrder(a0)
    println()
    postOrder(a0)

    //Create 2nd Test Tree and Traverse:
    println("\n\nTest Tree 2:\n---------------------------------------------")
    val i0 = TreeNode(1)
    val i1 = i0.addChild(2)
    val j1 = i0.addChild(3)
    i1.addChild(4)
    i1.addChild(5)
    j1.addChild(6)
    j1.addChild(7)
    preOrder(i0)
    println()
    postOrder(i0)

    //Create 3rd Test Tree and Traverse:
    println("\n\nTest Tree 3:\n---------------------------------------------")
    val x0 = TreeNode("Root")
    val x1 = x0.addChild("edu")
    val y1 = x0.addChild("com")
    val x2 = x1.addChild("unc")
    val y2 = y1.addChild("google")
    y1.addChild("yahoo")
    x2.addChild("med")
    x2.addChild("cs")
    y2.addChild("maps")
    preOrder(x0)
    println()
    postOrder(x0)
}

fun <T> preOrder(t: TreeNode<T>) {
    if (t.getParent() == null) {
        print("Pre-order: ")
    }
    print("${t.data} ")
    for (t: TreeNode<T> in t.getChildren()) {
        preOrder(t)
    }
}

fun <T> postOrder(t: TreeNode<T>) {
    if (t.getParent() == null) {
        print("Post-order: ")
    }
    for (t: TreeNode<T> in t.getChildren()) {
        postOrder(t)
    }
    print("${t.data} ")
}
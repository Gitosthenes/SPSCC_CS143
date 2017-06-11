package Lab_7.Num7_2

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
fun main(args: Array<String>) {
    //Root Node
    val a0: TreeNode<Int> = TreeNode(10)
    //Level 1 children
    val a1: TreeNode<Int> = a0.addChild(6)
    val b1: TreeNode<Int> = a0.addChild(18)
    //Level 2 children
    val a2: TreeNode<Int> = a1.addChild(4)
    val b2: TreeNode<Int> = a1.addChild(8)
    val c2: TreeNode<Int> = b1.addChild(15)
    val d2: TreeNode<Int> = b1.addChild(21)

    outputTree(a0)
}

fun <T> outputTree(t: TreeNode<T>) {
    var parent: TreeNode<T>? = t.getParent()
    while (parent != null) {
        print("   ")
        parent = parent.getParent()
    }
    println(t.data)
    for (a: TreeNode<T> in t.getChildren()) {
        outputTree(a)
    }
}
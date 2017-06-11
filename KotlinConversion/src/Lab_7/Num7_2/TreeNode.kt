package Lab_7.Num7_2

/**
 * Created by Alex Bledsoe, 6/11/2017.
 */
class TreeNode<T>(data: T) {
    var data: T? = null
    private var children = mutableListOf<TreeNode<T>>()
    private var parent: TreeNode<T>? = null

    init {
        this.data = data
    }

    fun addChild(data: T): TreeNode<T> {
        val newChild: TreeNode<T> = TreeNode(data)
        newChild.setParent(this)
        children.add(newChild)
        return newChild
    }

    fun addChildren(children: List<TreeNode<T>>) {
        for (t: TreeNode<T> in children) {
            t.setParent(this)
        }
        this.children.addAll(children)
    }

    fun getChildren(): List<TreeNode<T>> {
        return children
    }

    private fun setParent(parent: TreeNode<T>) {
        this.parent = parent
    }

    fun getParent(): TreeNode<T>? {
        return parent
    }
}
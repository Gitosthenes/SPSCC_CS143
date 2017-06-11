//Java program by Alex Bledsoe, 05/15/2017
// TreeNode class thanks to http://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children

public class TreeTest {
	public static void main(String[] args) {
		
		// Creates and outputs the following tree sturucture:
		//            "root node"
		//              /    \
		//             B      C
		//             |      | \  
		//             D      E  F
		
		// Create root node
		TreeNode<Integer> a = new TreeNode<>();
		a.data = 10;
		
		// Create depth 2 children
		TreeNode<Integer> b = a.addChild(new TreeNode<>(6));
		TreeNode<Integer> c = a.addChild(new TreeNode<>(18));
		
		// Create depth 3 children
		TreeNode<Integer> d = b.addChild(new TreeNode<>(4));
		TreeNode<Integer> e = b.addChild(new TreeNode<>(8));
		TreeNode<Integer> f = c.addChild(new TreeNode<>(15));
		TreeNode<Integer> g = c.addChild(new TreeNode<>(21));
		
		outputTree (a);	
	}
	
	
	// ouputTree
	// Prints a tree to the console
	// Students do not need to modify this code.
	public static <T> void outputTree (TreeNode<T> t) {
		
		if (t.getParent() == null)
			System.out.print("Root node: " );
		
		// This recurses repeatedly through the parents of each branch of the tree
		// This is O(n^2) and could be dramatically improved.
		TreeNode<T> parent = t.getParent();
		while (parent != null) {
			System.out.print("  ");
			parent = parent.getParent();
		} 
		System.out.println(t.data);
		
		for (TreeNode<T> a : t.getChildren())
			outputTree(a);
	}
}

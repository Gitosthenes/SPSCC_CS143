// Student name   Today's Date

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
		TreeNode<String> a = new TreeNode<String>();
		a.data = "root node";
		
		// Create depth 2 children
		TreeNode<String> b = a.addChild(new TreeNode<String>("B"));
		TreeNode<String> c = a.addChild(new TreeNode<String>("C"));
		
		// Create depth 3 children
		TreeNode<String> d = b.addChild(new TreeNode<String>("D"));
		TreeNode<String> e = c.addChild(new TreeNode<String>("E"));
		TreeNode<String> f = c.addChild(new TreeNode<String>("F"));		
		
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

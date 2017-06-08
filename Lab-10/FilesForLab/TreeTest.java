// Student name   Today's Date

// TreeNode class thanks to http://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children
import java.util.*;

public class TreeTest {
	public static void main(String[] args) {
		
		// Creates a tree structure		
		TreeNode<String> a = new TreeNode<String>();
		a.data = "root";	
		TreeNode<String> b = a.addChild(new TreeNode<String>("never"));
		TreeNode<String> c = a.addChild(new TreeNode<String>("ever"));
		TreeNode<String> d = a.addChild(new TreeNode<String>("let"));
		TreeNode<String> e = b.addChild(new TreeNode<String>("them"));	
		TreeNode<String> f = c.addChild(new TreeNode<String>("get"));		
		TreeNode<String> g = d.addChild(new TreeNode<String>("you"));			
		TreeNode<String> h = d.addChild(new TreeNode<String>("down"));		

		breadthFirstSearch (a);
	}
	

	// breadthFirstSearch
	// Enumerates all nodes in a tree
	// Displays the tree and enumerated list of nodes to the console
	public static <T> void breadthFirstSearch (TreeNode<T> root)	
	{
		// A class that implements the Set interface
		ArrayList<TreeNode<T>> s = new ArrayList<>();
		
		// A class that implements the Queue interface
		ArrayDeque<TreeNode<T>> q = new ArrayDeque<>();
		
		// Run a breadth-first search
		s.add(root);
		q.offer(root);
		
		while (!q.isEmpty() ){
			TreeNode<T> current = q.remove();
			for (TreeNode<T> i: current.getChildren()) {
				if (! s.contains(i)) {
					s.add(i);
					q.offer(i);
				}
			}
 		}
		
		// Output results
		System.out.println("Breadth-first search of this tree:");
		outputTree (root);
		
		System.out.println("Has results:");
		for (TreeNode<T> i: s) {
			System.out.print(i.data + " ");
		}
		System.out.println();
		System.out.println();
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

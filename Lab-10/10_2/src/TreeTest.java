//Alex Bledsoe, 06/07/2017

// TreeNode class thanks to http://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children
import java.util.*;

public class TreeTest {
	public static void main(String[] args) {
		
		// Creates a tree 'a' and calls breadth first search method.
		TreeNode<Integer> a1 = new TreeNode<>();
		a1.data = 7;
		TreeNode<Integer> b1 = a1.addChild(new TreeNode<>(3));
		TreeNode<Integer> c1 = a1.addChild(new TreeNode<>(9));
		TreeNode<Integer> d1 = b1.addChild(new TreeNode<>(1));
		TreeNode<Integer> e1 = c1.addChild(new TreeNode<>(10));
		TreeNode<Integer> f1 = d1.addChild(new TreeNode<>(2));
		TreeNode<Integer> g1 = e1.addChild(new TreeNode<>(8));
		TreeNode<Integer> h1 = g1.addChild(new TreeNode<>(4));

		breadthFirstSearch (a1);

        // Creates a tree 'b' and calls breadth first search method.
        TreeNode<Integer> a2 = new TreeNode<>();
        a2.data = 7;
        TreeNode<Integer> b2 = a2.addChild(new TreeNode<>(3));
        TreeNode<Integer> c2 = a2.addChild(new TreeNode<>(11));
        TreeNode<Integer> d2 = b2.addChild(new TreeNode<>(1));
        TreeNode<Integer> e2 = b2.addChild(new TreeNode<>(5));
        TreeNode<Integer> f2 = e2.addChild(new TreeNode<>(4));
        TreeNode<Integer> g2 = c2.addChild(new TreeNode<>(10));
        TreeNode<Integer> h2 = c2.addChild(new TreeNode<>(15));

        breadthFirstSearch (a2);
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

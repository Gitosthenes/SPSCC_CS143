// Java program by Alex Bledsoe, 05/23/2017

// TreeNode class thanks to http://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children

public class TreeTest {
	public static void main(String[] args) {

		//TEST TREE 1
		
		// Creates and traverses the following tree structure:
		//                10
		//              /    \
		//             6      18
		//            / \    /  \
		//           4   8  15  21
		
		// Create root node
		TreeNode<Integer> a1 = new TreeNode<>();
		a1.data = 10;
		
		// Create depth 2 children
		TreeNode<Integer> b1 = a1.addChild(new TreeNode<>(6));
		TreeNode<Integer> c1 = a1.addChild(new TreeNode<>(18));
		
		// Create depth 3 children
		TreeNode<Integer> d1 = b1.addChild(new TreeNode<>(4));
		TreeNode<Integer> e1 = b1.addChild(new TreeNode<>(8));
		TreeNode<Integer> f1 = c1.addChild(new TreeNode<>(15));
		TreeNode<Integer> g1 = c1.addChild(new TreeNode<>(21));

		System.out.println("Test tree 1:\n------------");
		preOrder(a1);
		System.out.println();
		postOrder(a1);
		System.out.println("\n");

		/*************************************************************************/
		//TEST TREE 2

		// Creates and traverses the following tree structure:
		//                1
		//              /    \
		//             2      3
		//            / \    /  \
		//           4   5  6    7

		// Create root node
		TreeNode<Integer> a2 = new TreeNode<>();
		a2.data = 1;

		// Create depth 2 children
		TreeNode<Integer> b2 = a2.addChild(new TreeNode<>(2));
		TreeNode<Integer> c2 = a2.addChild(new TreeNode<>(3));

		// Create depth 3 children
		TreeNode<Integer> d2 = b2.addChild(new TreeNode<>(4));
		TreeNode<Integer> e2 = b2.addChild(new TreeNode<>(5));
		TreeNode<Integer> f2 = c2.addChild(new TreeNode<>(6));
		TreeNode<Integer> g2 = c2.addChild(new TreeNode<>(7));

		System.out.println("Test tree 2:\n------------");
		preOrder(a2);
		System.out.println();
		postOrder(a2);
		System.out.println("\n");

		/*************************************************************************/

		//TEST TREE 3

		// Creates and traverses the following tree structure:
		//              _ Root _
		//            /          \
		//           edu         com
		//            |			/    \
		//           unc    google  yahoo
		//          /   \      |
		//        med   cs    maps

		// Create root node
		TreeNode<String> a3 = new TreeNode<>();
		a3.data = "Root";

		// Create depth 2 children
		TreeNode<String> b3 = a3.addChild(new TreeNode<>("edu"));
		TreeNode<String> c3 = a3.addChild(new TreeNode<>("com"));

		// Create depth 3 children
		TreeNode<String> d3 = b3.addChild(new TreeNode<>("unc"));
		TreeNode<String> e3 = c3.addChild(new TreeNode<>("google"));
		TreeNode<String> f3 = c3.addChild(new TreeNode<>("yahoo"));

		//  Create depth 4 children
		TreeNode<String> g3 = d3.addChild(new TreeNode<>("med"));
		TreeNode<String> h3 = d3.addChild(new TreeNode<>("cs"));
		TreeNode<String> i3 = e3.addChild(new TreeNode<>("maps"));


		System.out.println("Test tree 3:\n------------");
		preOrder(a3);
		System.out.println();
		postOrder(a3);
		System.out.println("\n");
	}

	static <T> void preOrder(TreeNode<T> p) {
		if (p.getParent() == null)
			System.out.print("PreOrder: " );
		System.out.print(p.data + " ");
		for (TreeNode<T> a : p.getChildren())
			preOrder(a);
	}

	static <T> void postOrder(TreeNode<T> p) {
		if (p.getParent() == null)
			System.out.print("PostOrder: " );
		for (TreeNode<T> a : p.getChildren())
			postOrder(a);
		System.out.print(p.data + " ");
	}
}
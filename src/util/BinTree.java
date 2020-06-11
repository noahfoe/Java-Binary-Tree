package util;

/*
 * nff11@txstate.edu
 * Date: 6/11/2020
 * @author Noah Foley
 * 
 */

public class BinTree {
	private Node root;

	/**
	 * This function creates a new node,
	 * and then sets the root equal to another function.
	 * @param x key value
	 */
	public void insertNode(int x){
		Node node = new Node(x);
		root = insert(root, x);
	}
	
	/**
	 * This function inserts an item into the tree
	 * @param tree
	 * @param x key value
	 * @return
	 */
	private Node insert(Node tree, int x)
	// Inserts item into tree.
	// Post:  item is in tree; search property is maintained.
	{
		/* Binary Tree Implementation */
		
		// if empty tree, create/return new node
		if(tree == null) {
			tree = new Node(x);
			return tree;
		}
		
		// put item in either left or right branch of the tree
		if(x < tree.key) {
			// Recursively calling insert function for left child
			tree.left = insert(tree.left, x);
		} else if(x > tree.key) {
				// Recursively calling insert function for right child
				tree.right = insert(tree.right, x);
			}
		
	  // return the tree
	  return tree;
	} 
	
	/**
	 *  This function calls the inOrder tree walk function
	 */
	public void treeWalk() {
		inOrder(root);
	}
	
	/**
	 * This recursive function prints the inOrder traversal to the console
	 * @param tree
	 */
	private void inOrder(Node tree)
	// Post: node keys printed in order.
	{
		// Recursive - inOrder Traversal Implementation (left first, then right)
		if(tree != null) {
			inOrder(tree.left);
			System.out.println(tree.key);
			inOrder(tree.right);
		}


	}
}

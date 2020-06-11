package util;

/*
 * nff11@txstate.edu
 * Date: 6/11/2020
 * @author Noah Foley
 * 
 */

class Node {
	// Each node will have a key and possibly a right and left child
	Node right;
	Node left;
	int key;
	// Constructor
	Node(int key) {
		this.key = key;
	}
}

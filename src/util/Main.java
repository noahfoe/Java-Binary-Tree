package util;

/*
 * nff11@txstate.edu
 * Date: 6/11/2020
 * @author Noah Foley
 * 
 */

public class Main {

	/**
	 * The main function of this program
	 * @param args an array of string arguments
	 */
	public static void main(String[] args) {
		BinTree binTree = new BinTree();
		// testcase 2
		System.out.println();
		System.out.println("testcase 1:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(3);
		binTree2.insertNode(201);
		binTree2.insertNode(60);
		binTree2.insertNode(30);
		binTree2.insertNode(45);
		binTree2.treeWalk();
				
		// testcase 3
		System.out.println();
		System.out.println("testcase 2_1:");
		BinTree binTree3 = new BinTree();
		binTree3.insertNode(-10);
		binTree3.insertNode(-150);
		binTree3.insertNode(4);
		binTree3.insertNode(300);
		binTree3.insertNode(45);
		binTree3.treeWalk();
		binTree3.insertNode(-50);
		binTree3.insertNode(200);
		System.out.println();
		System.out.println("testcase 2_2:");
		binTree3.treeWalk();
	}
}

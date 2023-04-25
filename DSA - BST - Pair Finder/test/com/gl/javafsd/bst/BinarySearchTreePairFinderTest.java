package com.gl.javafsd.bst;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);		
		tree.insert(30);		
		tree.insert(50);		
		tree.insert(70);
		
		BinarySearchTreePairFinder finder 
			= new BinarySearchTreePairFinder(tree, 130);
		finder.findPairOfNodes();
	}
}
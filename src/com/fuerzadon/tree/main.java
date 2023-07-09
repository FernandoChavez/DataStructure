package com.fuerzadon.tree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		/*
		tree.add(5, "HOLA MUNDo");
		tree.add(4, -1234);
		tree.add(7, null);
		tree.add(1, 1);
		tree.add(9, "asdlkj");
		tree.add(5, 5);
		*/
		
		tree.add(5, null);
		tree.add(2, null);
		tree.add(1, null);
		tree.add(3, null);
		tree.add(8, null);
		tree.add(6, null);
		tree.add(10, null);
		
		tree.inorder(tree.root);
		
		//tree.inorder(tree.root.left);
	}

}

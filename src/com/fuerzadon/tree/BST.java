package com.fuerzadon.tree;

public class BST {
	
	Nodo root;
	
	public BST() {
		root = null;
	}
	
	//inorder tree walk
	public void inorder(Nodo x) {
		if(x != null) {
			inorder(x.left);
			System.out.println(x.key);
			inorder(x.right);
		}
	}
	
	//preorder tree walk
	public void preorder(Nodo x) {
		if(x != null) {
			System.out.println(x.key);
			inorder(x.left);
			inorder(x.right);
		}
	}
	
	//postorder tree walk
	public void postorder(Nodo x) {
		if(x != null) {
			inorder(x.left);
			inorder(x.right);
			System.out.println(x.key);
		}
	}
	
	//Add new nodo
	public void add(int key, Object value) {
		Nodo n = new Nodo(key);
		n.value = value;
		
		if(root == null) {
			root = n;
		}else {
			Nodo temporal = root;
			while(temporal != null) {
				n.p = temporal;
				if(n.key >= temporal.key) {
					temporal = temporal.right;
				}else {
					temporal = temporal.left;
				}
			}
			
			if(n.key < n.p.key) {
				n.p.left = n;
			}else {
				n.p.right = n;
			}
		}
	}
	
	//Nodo class
	public class Nodo{
		public Nodo p;
		public Nodo right;
		public Nodo left;
		public int key;
		public Object value;
		
		public Nodo(int key) {
			this.key = key;
			right = null;
			left = null;
			p = null;
			value = null;
		}
	}

}

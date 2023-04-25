package com.greatlearning.sumpair;

public class TreeNodes {
	int data;
	TreeNodes left,right;

	TreeNodes(int data){
		this.data = data;
		left = right = null;
	}
public TreeNodes insertData(int data, TreeNodes root) {
if (root == null) {
	return new TreeNodes(data);
}
if(data<root.data) {
	root = insertData(data, root.left);
} else if (data > root.data) {
	root = insertData(data, root.right);
}else {
	System.out.println("Given data is already present in BST");
}
return root;
}
}
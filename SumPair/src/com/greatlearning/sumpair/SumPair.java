package com.greatlearning.sumpair;
import java.util.HashSet;
import java.util.Set;

public class SumPair {
	public static void main(String[] args) {
		TreeNodes root = new TreeNodes(130);
		root.insertData(20, root);
		root.insertData(60, root);
		root.insertData(10, root);
		root.insertData(30, root);
		root.insertData(50, root);
		root.insertData(70, root);
		int sum = 120;
		Set<Integer> data = new HashSet<Integer>();
		if (!findSumPair(root, sum, data)) {
			System.out.println("Pair does not exists for given sum");
		}
	}

	private static boolean findSumPair(TreeNodes root, int sum, Set<Integer> data) {
		// TODO Auto-generated method stub
		if(root == null) {
		return false;
	}
		  if (findSumPair(root.left, sum, data)) {
    	return true;
    }
    int remainder = sum - root.data;
    if (data.contains(remainder)) {
    	System.out.println("The pair(" +root.data+"," +remainder+")can from the given sum");
    return true;
    }else {
    	data.add(root.data);
    }
    return findSumPair(root.right, sum, data);
}
}
	

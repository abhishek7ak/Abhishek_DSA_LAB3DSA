package com.greatlearning.sumpair;

import java.util.HashSet;
import java.util.Set;

public class SumPair1 {

	public static void main(String[] args) {
		TreeNodes root = new TreeNodes(130);
		root.insertData(20, root);
		root.insertData(60, root);
		root.insertData(10, root);
		root.insertData(30, root);
		root.insertData(50, root);
		root.insertData(70, root);
		int sum = 130;
		Set<Integer> data = new HashSet<Integer>();
		if(!findSumPair1(root, sum, data)) {
		System.out.println("Pair does not exists for given sum");	
		}
	}

	private static boolean findSumPair1(TreeNodes root, int sum, Set<Integer> data) {
		// TODO Auto-generated method stub
		if(root == null) {
		return false;
	}
		if (findSumPair1 (root.left, sum, data)) {
    return true;
	}
	 int remainder = sum - root.data;
	 if (data.contains(remainder)) {
		 System.out.println("The pair("+root.data+","+remainder+") can form the given sum");
	return true;
	 }else {
		 data.add(root.data);
	    }
	    return findSumPair1(root.right, sum, data);
	 }
	 }
	 

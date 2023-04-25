package com.java.greatlearning.bracketbalancing;

import java.util.Stack;

public class BracketBalancing {
	
public static void main(String[] args) {
	String Brackets = "({[]})";
	if (areBracketBalanced(Brackets)) {
		System.out.println(" Brackets are balanced");
	}else {
		System.out.println("Brackets are not balanced");
	}
}
private static boolean areBracketBalanced(String Brackets) {
     Stack<Character> stackData = new Stack<Character>();
     for (char ch : Brackets.toCharArray()) {
    	 if(ch == '(' || ch == '{' || ch=='[') {
    		 stackData.push(ch);
    		 continue;
    	 }
    	 if (stackData.isEmpty()) {
    		 return false; 
    	 }
    	 switch (ch) {
    	 case '}':
    		 if (stackData.pop() != '{') {
    			 return false;
    		 }
    		 break;
    	 case')':
    		 if (stackData.pop() != '(') {
    			 return false;
    		 }
    		 break;
    	 case ']':
    		 if (stackData.pop() != '[') {
    			 return false;
    		 }
    		 break;
    		 default:
    			 System.out.println("Invalid character within brackets");
               return false; 
    	 }
     }
	return stackData.isEmpty();	
}
}

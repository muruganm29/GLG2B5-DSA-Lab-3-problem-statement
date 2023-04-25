package com.gl.javafsd.dsa.balancedbrackets;

import java.util.Stack;

public class BalancedBracketsChecker {

	public BalancedBracketsChecker(String expression) {
	}
	
	 public static boolean isBalanced(String input) {
	        Stack<Character> stack = new Stack<>();
	        for (char c : input.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') ||
	                    (c == ']' && top != '[') ||
	                    (c == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }

	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
	}
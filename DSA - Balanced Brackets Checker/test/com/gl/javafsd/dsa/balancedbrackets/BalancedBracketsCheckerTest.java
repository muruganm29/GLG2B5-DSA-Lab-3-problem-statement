package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {
		
		String expression = "( [ [ { } ] ] )";
		BalancedBracketsChecker checker = 
			new BalancedBracketsChecker(expression);
		
		boolean result = checker.check();
		if (result) {
			System.out.printf("Expression %s The entered String has Balanced Brackets", expression);
		}else {
			System.out.printf("Expression %s The entered Strings do not contain Balanced Brackets", expression);
		}
	}
}

package com.gl.javafsd.dsa.balancedbrackets;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string containing brackets:");
        String input = scanner.nextLine();
        if (isBalanced(input)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
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
}
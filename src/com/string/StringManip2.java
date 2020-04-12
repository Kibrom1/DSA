package com.string;

import java.util.Stack;

public class StringManip2 {
	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' || c == ']' || c == '}') {
				if (stack.isEmpty())
					return false;
				if (!isMatchingPair(stack.pop(), c))
					return false;
			}
		}
		if (stack.isEmpty())
			return true;

		return false;
	}
	
	private static boolean isMatchingPair(char a, char b) {

		if (a == '(' && b == ')')
			return true;
		if (a == '[' && b == ']')
			return true;
		if (a == '{' && b == '}')
			return true;
		return false;
	}
	
	public static int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.lastIndexOf(" ") == 0)
            return 0;
        
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }


	public static void main(String[] args) {
		String st = "()[]{}";
		System.out.println(isValid(st));
		
		System.out.println(lengthOfLastWord("Hellow world "));
	}
}

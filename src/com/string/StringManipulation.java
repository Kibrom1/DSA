package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StringManipulation {

	/*
	 * cd /a/b/c => /a/b/c - if it doesn' have . cd /one/././two => /one/two - if
	 * one . cd /one/two/../three => /one/three - if multiple . cd /one/.././two =>
	 * /two cd /one/two/../../three => /three no: /a/\ b/ no: ../a
	 *
	 * . = do nothing .. = go up a level
	 */

	public static String absolutePath(String path) {

		String[] splitPath = path.split("/");
		System.out.println(splitPath);

		Stack<String> pathStack = new Stack<String>();
		for (String st : splitPath) {
			if (st.equals(".")) {
				// doNothing
			} else if (st.equals("..")) {
				// remove the previous string
				pathStack.pop();
			} else {
				// push to the stack
				pathStack.push(st);
			}
		}

		return String.join("/", pathStack);
	}

	public static String longestPalindrome(String s) {
		String longestPal = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isPalindrome(s.substring(i, j))) {
					if (s.substring(i, j).length() > longestPal.length()) {
						longestPal = s.substring(i, j);
					}
				}
			}
		}
		return longestPal;
	}

	public static String[] notDuplicateWords(String s, String t) {
		String[] sList = s.split(" ");
		String[] tList = t.split(" ");
		String[] result = new String[sList.length];
		int k = 0;
		for (int i = 0; i < sList.length; i++) {
			boolean exists = false;
			for (int j = 0; j < tList.length; j++) {
				if ((sList[i].equals(tList[j]))) {
					exists = true;
				}
			}
			if (!exists) {
				result[k] = sList[i];
				k++;
			}

		}
		return result;
	}

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr[0].length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {
				int maxValue = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j];
				max = max < maxValue ? maxValue : max;
			}
		}

		return max;
	}

	public static boolean isPalindrome(String pal) {
		if (pal.length() <= 1)
			return true;
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> romanNumber = new HashMap<>();
		romanNumber.put('I', 1);
		romanNumber.put('V', 5);
		romanNumber.put('X', 10);
		romanNumber.put('L', 50);
		romanNumber.put('C', 100);
		romanNumber.put('D', 500);
		romanNumber.put('M', 1000);

		int num = 0;

		if (s.length() < 1)
			return 0;

		for (int i = s.length() - 1; i >= 0;) {
			if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
				if ((i - 1 >= 0) && s.charAt(i - 1) == 'I') {
					num += romanNumber.get(s.charAt(i)) - 1;
					i -= 2;
				} else {
					num += romanNumber.get(s.charAt(i));
					i--;
				}
			} else if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
				if ((i - 1 >= 0) && s.charAt(i - 1) == 'X') {
					num += romanNumber.get(s.charAt(i)) - 10;
					i -= 2;
				} else {
					num += romanNumber.get(s.charAt(i));
					i--;
				}
			} else if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				if ((i - 1 >= 0) && s.charAt(i - 1) == 'C') {
					num += romanNumber.get(s.charAt(i)) - 100;
					i -= 2;
				} else {
					num += romanNumber.get(s.charAt(i));
					i--;
				}
			} else {
				num += romanNumber.get(s.charAt(i));
				i--;
			}
		}

		return num;
	}

	public static String longestCommonPrefix(String[] sts) {

		if (sts.length < 1)
			return "";
		String common = sts[0];

		for (int i = 0; i < sts.length; i++) {
			common = LCW(common, sts[i]);
		}

		return common;
	}

	public static String LCW(String st1, String st2) {
		String common = "";
		int len1 = st1.length();
		int len2 = st2.length();

		for (int i = 0, j = 0; i < len1 && j < len2; i++, j++) {
			if (st1.charAt(i) != st2.charAt(j)) {
				break;
			}
			common = common + st1.charAt(i);
		}

		return common;
	}

	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 */

	public static boolean isValid(String st) {
		
		return false;
	}
}

package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulation {
	public static int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		for (int i = 0; i < strs.length; i++) {
			boolean added = false;
			for (int j = 0; j < result.size(); j++) {
				if (isAnagram(result.get(j).get(0), strs[i])) {
					result.get(j).add(strs[i]);
					added = true;
					break;
				}
			}
			if (!added) {
				List<String> newList = new ArrayList<>();
				newList.add(strs[i]);
				result.add(newList);
			}
		}
		return result;
	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] s1Char = new char[s1.length()];
		char[] s2Char = new char[s2.length()];
		for (int i = 0; i < s1.length(); i++) {
			s1Char[i] = s1.charAt(i);
			s2Char[i] = s2.charAt(i);
		}
		Arrays.sort(s1Char);
		Arrays.sort(s2Char);
		for (int i = 0; i < s1.length(); i++) {
			if (s1Char[i] != s2Char[i])
				return false;
		}

		return true;
	}

	public static int countElement(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + 1 == arr[j]) {
					count++;
				}
			}
		}

		return count;
	}

	public static boolean backspaceCompare(String S, String T) {
		return backSpaceString(S).equals(backSpaceString(T));
	}

	private static String backSpaceString(String st) {
		while (st.indexOf("#") != -1) {
			if (st.indexOf("#") == 0) {
				st = st.substring(1);
			} else if (st.indexOf("#") == 1) {
				st = st.substring(2);
			} else {
				String rst = st.substring(0, st.indexOf("#") - 1);
				if(st.indexOf("#") < st.length()) {
					st = rst + st.substring(st.indexOf("#") + 1);
				}
			}
		}

		return st;
	}

}

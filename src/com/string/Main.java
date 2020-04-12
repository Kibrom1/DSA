package com.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String, String> mp = new HashMap<String, String>();
		
		//Find Unix based absolute path
		System.out.println(StringManipulation.absolutePath("/a/b/c"));
	    System.out.println(StringManipulation.absolutePath("/one/././two"));
	    System.out.println(StringManipulation.absolutePath("/one/two/../../three"));
	    
	    //Checking longest palindrome string
	    System.out.println(StringManipulation.longestPalindrome("aacaa"));
	    
	    String s = "I went to school last week and ate a super carne asada buritto afterwards for dinner";
	    String t = "went last week and ate a supper for dinner";
	    System.out.println(s);
	    System.out.println(t);
	    String[] result = StringManipulation.notDuplicateWords(s, t);
	    for(int i=0; i< result.length && result[i] != null; i++) {
	    	System.out.print(result[i] + " ");
	    }
	    
	    String st = "LVIII";
	    System.out.println(StringManipulation.romanToInt(st));
	    
	    swapWithOutTemp(10,  20);
	    System.out.println("Coomon: " + StringManipulation.LCW("racecar", "car"));
	    String[] sts = {"flower","flow","flight"};
	    System.out.println("LCP: " + StringManipulation.longestCommonPrefix(sts));
	    
	}
	
	public static void swapWithOutTemp(int a, int b) {
		System.out.println("Before Swapping a: " + a);
		System.out.println("Before Swapping b: " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Switching a: " + a);
		System.out.println("After Switching b: " + b);
	}

}
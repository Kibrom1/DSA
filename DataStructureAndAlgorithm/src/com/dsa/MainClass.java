package com.dsa;

public class MainClass {

	public static void main(String[] args) {
		
		StringManipulation manip = new StringManipulation();
		
		int[] prices = { 1, 2, 3, 4, 5 };
		System.out.println(StringManipulation.maxProfit(prices));
		System.out.println(StringManipulation.isAnagram("day", "dad"));
		int[] arr = { 1, 1, 2, 2 };
		System.out.println(StringManipulation.countElement(arr));

		// xywrrmp
		//xywrrmu#p - xywrrmp
		String t = "xywrrmu#p";
		System.out.println(t.indexOf("#"));
		System.out.println(t.substring(0, t.indexOf("#")-1));
		System.out.println(t.substring(t.indexOf("#") + 1));
		System.out.println(StringManipulation.backspaceCompare("xywrrmp", "xywrrmu#p"));

	}

}

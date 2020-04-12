package com.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;

public class Challenge {
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == 1)
				return nums[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println("THis is the first trial section");
		Challenge challenge = new Challenge();
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		System.out.println(challenge.singleNumber(arr));
		Float f1 = new Float("3.0");
		int x = f1.intValue();
		byte b = f1.byteValue();
		double d = f1.doubleValue();
		System.out.println(x + b + d);
		
		Properties p = System.getProperties();
		p.setProperty("pirate", "scurvy");
		String s = p.getProperty("argProp") + " ";
		s += p.getProperty("pirate");
		System.out.println(s);
		
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(12);
		queue.add(5);
		queue.add(3);
		queue.add(20);
		
		System.out.println(queue.poll());
	}
	
	public static void badMethod() {}

}

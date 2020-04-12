package com;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author kabera
 *
 */
public class Testing {

	public static void main(String[] args) {
		PriorityQueue toDo = new PriorityQueue(); 
		         toDo.add("dishes"); 
		         toDo.add("laundry"); 
		         toDo.add("bills"); 
		         toDo.offer("bills"); 
		         System.out.print(toDo.size() + " " + toDo.poll()); 
		         System.out.print(" " + toDo.peek() + " " + toDo.poll()); 
	         System.out.println(" " + toDo.poll() + " " + toDo.poll()); 
	         
	         System.out.println(Math.ceil(-4.7));
	         System.out.println();
	         System.out.println();
	         System.out.println();
	         
	         System.err.println();
	         int i = 010;
	         int j = 07;
	         System.out.println(i);
	         System.out.println(j);
	         
	         int mask = 0x000F;
	         int value = 0x2222;
	         System.out.println(mask & value);
	         
	         List<String> strings =Arrays.asList("Kebede", "Hagos", "", "Gebre", "Hagos", "Kebede");
	         strings.forEach(st -> System.out.println(st));
	         Set<String> stream = strings.stream().filter(st -> !st.isEmpty()).collect(Collectors.toSet());
	         System.out.println("counting: " +  strings.stream().filter(st-> st.isEmpty()).count());
	         for(String st: stream) {
	        	 System.out.println(st);
	         }
	         System.out.println("======= distinct");
	         strings.stream().distinct().filter(st -> !st.isEmpty()).map(st -> st + st).limit(2).sorted().forEach(st -> System.out.println(st));
	         System.out.println("========");
	         strings.stream().filter(st -> !st.isEmpty()).distinct().forEach(st -> System.out.println(st));
	         
	         Random rand = new Random();
	         rand.ints().limit(10).forEach(x -> System.out.println(x));

	}

}

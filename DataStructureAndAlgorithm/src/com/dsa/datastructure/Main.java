package com.dsa.datastructure;

import com.dsa.datastructure.physicalds.Arrays;
import com.dsa.datastructure.recurssion.RecursionStack;
import com.dsa.datastructure.runtimeanalysis.RunTimeAnalysis;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	    //Testing how stack works when executing a function
        RecursionStack.mainPrinter();

        //Testing recursive call and stack together
        RecursionStack.foo(3);

        //Testing recursion with factorial
        System.out.println(RecursionStack.factorial(5));

        //Testing recursion using fibonacci series
        System.out.println(RecursionStack.fibonacci(6));

        //Testing the run time of an algorithm
        int[] arr = new int[12];
        //arr = [34,45,56,7,4,4,56];
        int[] array = new int[]{10, 20, 30, 40 ,50 ,60, 70, 80, 90, 100, 110};
        System.out.print("BST: "+ RunTimeAnalysis.binarySearch(110, array, 0, 10));

        //Array practicing
        Arrays.arrayOperation();
        System.out.println(Arrays.searhInArray(arr, 10));

        //2D arrays
        Arrays.twoDArray();
    }
}
    
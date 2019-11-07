package com.dsa.datastructure.physicalds;

import java.util.function.DoubleToIntFunction;

/**
 * This class deals with the physical data structure called Arrays,
 * the second physical data structure that I will cover later is Linked List
 * <p>
 * Array is a DS consisting of collections of elements, each identified by unique index.
 * A collection of similar data type
 * <p>
 * 1D array - single row and multiple columns
 * Multi Dimensional array - multiple rows and multiple columns
 */
public class Arrays {

    public static void arrayOperation() {
        int[] arr;
        arr = new int[]{1, 2, 3, 4, 5, 5, 6};
        arr[2] = 10;
        System.out.print("Arrays" + arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static String searhInArray(int[] arr, int n) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (n == arr[i])
                    return "Found";
            }
        } catch (Exception ex) {
            System.out.println("There was some kind of exception!");
        }
        return "Not found";
    }

    public static void twoDArray(){
        int[][] twod= new int[4][6];
        System.out.println(twod[1][2]);
    }
}

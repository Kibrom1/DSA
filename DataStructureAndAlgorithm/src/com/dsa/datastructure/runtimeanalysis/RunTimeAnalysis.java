package com.dsa.datastructure.runtimeanalysis;

/**
 * This class will be used to study run time analysis of algorithms.
 * Measuring the efficiency of an algorithm will give us a means to select among many algorithms to do a given task.
 *
 */
public class RunTimeAnalysis {

    /**
     * This iterative function is used to search a number in an array and returns the index of the number in the array
     * The complexity for this is O(n)
     * @param array - the array to search from
     * @param num - the number to seach
     * @return index of the array where the number is located
     */
    public static int searchNumber(int[] array, int num){
        for(int i= 0; i< array.length; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }

    /**
     * This iterative function is used to find the biggest number from an array.
     * The complexity  for this is O(n)
     * @param array - an array to find the biggest number from
     * @return - the biggest number
     */
    public static int findBiggestNumber(int[] array){
        int biggest = array[0];
        for (int i=0; i< array.length; i++){
            if(biggest < array[i])
                biggest = array[i];
        }
        return biggest;
    }
}

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
    public static int findBiggestNumberIterative(int[] array){
        int biggest = array[0];
        for (int i=0; i< array.length; i++){
            if(biggest < array[i])
                biggest = array[i];
        }
        return biggest;
    }

    /**
     * This function is used to to determine the run time complexity of finding the biggest number in an array
     * @param array - the array to find biggest number from
     * @param n - the length of the array
     * @return
     */

    public static int findBigestNumberRecursive(int[] array, int n) {
        int highest = Integer.MIN_VALUE;
        if (n == -1) {
            return highest;
        } else {
            if (array[n] > highest)
                highest = array[n];
            findBigestNumberRecursive(array, n - 1);
        }
        return highest;
    }

    /**
     * This function will try to find a number in a sorted array using binary search tree
     * This function runs O(logn) -
     * @param findNumber - the number that we are looking for
     * @param array - the array from which we looking the number
     * @param start - starting index to look the number
     * @param end - ending index to look the number
     * @return
     */
    public static int binarySearch(int findNumber, int[] array, int start, int end){
       if(start == end){
           if(findNumber == array[start])
               return start;
           else
               return -1;
       } else{
           int mid = findMid(start, end);
           if (array[mid] < findNumber)
               return binarySearch(findNumber, array, mid + 1, end);
           else if (array[mid] > findNumber)
               return binarySearch(findNumber, array, start, mid - 1);
           else
               return mid;
       }
    }

    private static int findMid(int start, int end) {
        return (start + end)/2;
    }
}

package com.dsa.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * This class is used to practice sorting algorithms.
 * 
 * @author kabera
 *
 */
public class Sort {

	/**
	 * This is the main function to sort an array using merge sort algorithm
	 * 
	 * @param arr - the array to be sorted
	 * @param l   - the lower index
	 * @param r   - the highest index
	 */
	void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle index
			int m = (l + r) / 2;
			// sort the left side of the array
			mergeSort(arr, l, m);
			// sort the right side of the array
			mergeSort(arr, m + 1, r);

			// Then merge the sorted halves
			merge(arr, l, m, r);

		}
	}

	/**
	 * This is the main function to sort an arry using quick sort algorithm
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);

			quickSort(arr, low, pivot - 1);// Before pivot
			quickSort(arr, pivot + 1, high);// After pivot
		}
	}

	/**
	 * this function is used to merge two sorted arrays The array will be divided
	 * into arr[l,m] and arr[m+1, r] - then individual array will be sorted
	 * independently of the other array
	 * 
	 * @param arr - the array to be sorted
	 * @param l   - the lower index
	 * @param m   - middle index
	 * @param r   - highest index
	 */
	void merge(int arr[], int l, int m, int r) {

		// get the sizes of the two arrays
		int n1 = m - l + 1;
		int n2 = r - m;

		// create the two temporary arrays, left and right
		int L[] = new int[n1];
		int R[] = new int[n2];

		// copy the data to the two temporary arrays
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}

		// initial index of the two sub arrays
		int i = 0, j = 0;

		// The initial index of the merged array
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy the remaining element of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy the remaining element of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * This function is used to partition. we select the pivot to be the last
	 * element in the array
	 * 
	 * @param arr  - the array to partition
	 * @param low  - the lower index
	 * @param high - the higher index
	 * @return index of the next element to compare
	 */
	public int partition(int arr[], int low, int high) {
		// get the lowest index
		int pivot = arr[high];// get the pivot which is the element in the highest index
		int i = (low - 1); // Get the lowest index
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// Swapping the elements in index i and j
				swap(arr, i, j);
			}
		}
		// swapping the element in i +1 and the high element
		swap(arr, i + 1, high);

		return i + 1;
	}

	/**
	 * This function is used to swap two elements
	 * 
	 * @param arr - the array
	 * @param i   - index of the first element
	 * @param j   - index of the second element
	 */
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * This function will be used to print the array
	 * 
	 * @param arr
	 */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * This function is used to sort using min swapping without auxiliary array We
	 * dont use an additional space here - there will not be any copying of element
	 * from one to other
	 * 
	 * @param arr
	 * @return
	 */
	public int[] minSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			// find the index of the the min element between i and len -1
			int pos = minPos(arr, i, len-1 - 1);
			// swap the min and the other element
			swap(arr, i, pos);

		}
		return arr;
	}

	public int minPos(int[] arr, int start, int end) {

		int min = arr[start];
		int minPos = start;
		for (int i = start + 1; i <= end; i++) {
			if (arr[i] < min) {
				minPos = i;
			}
		}

		return minPos;
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array merge sort");
		printArray(arr);

		
		Sort ob = new Sort();
		ob.mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nMerge Sorted array");
		printArray(arr);

		int arr2[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array Quick sort");
		printArray(arr2);

		Sort ob2 = new Sort();
		ob2.quickSort(arr2, 0, arr2.length - 1);

		System.out.println("Quick Sorted array");
		printArray(arr2);

		List<String> arrList = new LinkedList();
		List<Integer> intLists = new ArrayList<>();
		
		ArrayList<String> arrString = new ArrayList<String>();
		List<String> lstString = new LinkedList<>();
		
		arrList.add("babe");
		System.out.println(arrList.get(0));

		System.out.println(arrList.size());
		
		lstString.stream().forEach(lst -> {
			System.out.println(lst);
		});
	}
}

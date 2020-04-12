package com.dsa.datastructure;

import com.SampleDemo;
import com.Testin;
import com.dsa.datastructure.physicalds.LinkedList;
import com.dsa.datastructure.physicalds.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        while(n > 1){
            if(n%2 != 0){
                return false;
            } else{
                n = n/2;
            }
        }
        return true;
    }
    
    static void doIt(int x, int y, int m) {
    	if(x == 5) {
    		m = y;
    	} else {
    		m = x;
    	}
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> notExist = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != i + 1){
                notExist.add(i+1);
            }
        }
        return notExist;
    }

    public static void rotateOnce(int[] nums){
        int n = nums.length;
        int temp = nums[nums.length - 1];
        for(int i=1; i < nums.length ;i++){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }

    public static void rotate(int[] nums, int k) {
        for(int i = 0; i < k ; i++){
            rotateOnce(nums);
        }
    }

    /**
     * This function is used to reverse an array;
     * [1, 2, 3, 4, 5, 6, 7] == [7, 6, 5, 4, 3, 2, 1]
     * a[0] = a[6], a[1] = a[5] , a[2] = a[4], a[3] = a[3]
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr){
        for(int i = 0; i <= arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-32));
	    //Testing how stack works when executing a function
       // RecursionStack.mainPrinter();

        //Testing recursive call and stack together
        //RecursionStack.foo(3);

        //Testing recursion with factorial
        //System.out.println(RecursionStack.factorial(5));

        //Testing recursion using fibonacci series
        //System.out.println(RecursionStack.fibonacci(6));

        //Testing the run time of an algorithm
        int[] arr = new int[12];
        //arr = [34,45,56,7,4,4,56];
        int[] array = new int[]{10, 20, 30, 40 ,50 ,60, 70, 80, 90, 100, 110};
       // System.out.print("BST: "+ RunTimeAnalysis.binarySearch(110, array, 0, 10));

        //Array practicing
        //Arrays.arrayOperation();
        //System.out.println(Arrays.searhInArray(arr, 10));

        //2D arrays
        //Arrays.twoDArray();
        //int prod=1;
        /*for(int i = 1; i <= 31; i ++){
            prod *= 2;
        }*/
        /*System.out.println(prod);

        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        st = scanner.nextLine();
        System.out.println("String:" + st);*/

        /*System.out.println("====Linked List practice====");
        LinkedList linkedList = new LinkedList();
        linkedList.createNode("Creat Node");
        Node head = linkedList.getHead();
        System.out.println("========Creating New Node=====");
        System.out.println(head.getData());
        while (head.getNext() != null){
            head = head.getNext();
            System.out.println(head.getData());
        }

        System.out.println("=======Inserting first ");
        Node node = linkedList.insertFirst(head, "First Insert");
        Node firstNode = linkedList.getHead();
        System.out.println(firstNode.getData());
        while(firstNode.getNext() != null){
            firstNode = firstNode.getNext();
            System.out.println(firstNode.getData());
        }

        System.out.println("====Inserting Last======");
        Node lastNode = linkedList.insertLast( "Last Insert");
        Node last2Node = linkedList.insertLast( "another last");
        Node head1 = linkedList.getHead();
        System.out.println(head1.getData());
        while (head1.getNext() != null){
            head1 = head1.getNext();
            System.out.println(head1.getData());
        }
*/

        /*System.out.println("======Deleting Node===");
        Node head2 = linkedList.getHead();
        System.out.println(head2.getData());
        while(head2.getNext() != null){
            Node temp = head2.getNext();
            System.out.println(temp.getData());
           head2.setNext(null);
           head2 = temp;
        }*/
        //linkedList.deleteEntireLinkedList(linkedList);
       /* Node deletedHead = linkedList.getHead();
        System.out.println(linkedList.getHead());
        System.out.println(linkedList.getTail());*/
        /*while(deletedHead != null && deletedHead.getNext() != null){
            Node nextNode = deletedHead.getNext();
            System.out.println(nextNode.getData());
        }*/
        //int[] arrays = {1,2,3,4,5,6,7,8,9};
        //rotate(arrays, 3);
//        int[] result = reverseArray(arrays);
//        for(int i=0; i< result.length; i++){
//            System.out.print(result[i]);
//        }

        LinkedList linkedList = new LinkedList();
        Node head = new Node(null, null,"2");
        Node node2 = new Node(null, null, "4");
        Node node3 = new Node(null, null, "3");
        head.setNext(node2);
        node2.setNext(node3);
        linkedList.setHead(head);
        Node reversed = linkedList.reversLinkedList(head);

        Node startingNode = reversed;
        while (startingNode != null) {
            System.out.print(startingNode.getData());
            startingNode = startingNode.getNext();
        }

        ListNode lNode1 = new ListNode(3);
        ListNode lNode2 = new ListNode(4);
        ListNode lNode3 = new ListNode(2);
        lNode1.setNext(lNode2);
        lNode2.setNext(lNode3);

        ListNode lNode4 = new ListNode(5);
        ListNode lNode5 = new ListNode(6);
        ListNode lNode6 = new ListNode(4);
        lNode4.setNext(lNode5);
        lNode5.setNext(lNode6);

        Solution sol = new Solution();
        
        int i =6, j=4, k =9;
        doIt(i, j, k);
//        System.out.println("k " + k);
//        //System.out.println(sol.addTwoNumbers(lNode1, lNode4).getValue());
//        
        SampleDemo A = new SampleDemo("A");
        SampleDemo B = new SampleDemo("B");
        
        //B.start();
        //A.start();
        
		/*
		 * int x = 3 & 5; int y =3 | 5; System.out.println("values");
		 * System.out.println(x); System.out.println(y);
		 */
        System.out.println();
        System.out.println(A.anagram("adiam", "maiad"));
        
    }
}
    
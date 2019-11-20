package com.dsa.datastructure;

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

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> notExist = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != i + 1){
                notExist.add(i+1);
            }
        }
        return notExist;
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

        System.out.println("====Linked List practice====");
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

    }
}
    
package com.dsa.datastructure;

class Solution {

    public ListNode reversLinkedList(ListNode head){

        if(null == head || null == head.getNext()){
            return head;
        }
        ListNode todo = head.getNext();
        ListNode reversed = head;

        while(todo != null){
            ListNode temp = todo;
            todo = todo.getNext();
            temp.setNext(reversed);
            reversed = temp;
        }
        return reversed;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode n1 = reversLinkedList(l1);
        ListNode n2 = reversLinkedList(l2);

        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;
        dummy.setNext(currentNode);
        int carryOn = 0;

        while(n1 != null || n2 != null){
            int v1 = n1 == null ? 0 : n1.getValue();
            int v2 = n2 == null ? 0 : n2.getValue();

            int sum = v1 + v2 + carryOn;
            carryOn = sum/10;
            int val = sum%10;

            ListNode node = new ListNode(val);
            currentNode.setNext(node);

            currentNode = node;
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        return dummy.getNext();
    }
}
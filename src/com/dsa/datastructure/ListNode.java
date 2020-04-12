package com.dsa.datastructure;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    public void setValue(int val){
        this.val = val;
    }

    public int getValue(){
        return val;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public ListNode getNext(){
        return next;
    }
}

package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.LinkedList;
import com.dsa.datastructure.physicalds.Node;

/**
 * This class is used to learn the logical data structure called stack.
 * The operations with stack are
 * 1. create - Creating the Stack
 * 2. push - adding new element to the stack
 * 3. pop - poping and deleting the node from the stack
 * 4. peek - we just only return the top element and don't delete the element
 * 5. isEmpty - checking if the stack is empty or not
 * 6. delete -
 * 7. isFull - checks if the stack is full (used only in array)
 */
public class StackLinkedList {

    LinkedList linkedList;

    public StackLinkedList(){
        this.linkedList = new LinkedList();
    }

    public Node push(Node node){
        Node head = linkedList.getHead();
        if (head == null){
            linkedList.setHead(node);
        } else{
         node.setNext(head);
         linkedList.setHead(node);
        }
        linkedList.setSize(linkedList.getSize() + 1);
        return head;
    }

    public Node pop(){
        if(isEmpty()){
            return null;
        } else{ Node head = linkedList.getHead();
         linkedList.setHead(head.getNext());
         head.setNext(null);
         linkedList.setSize(linkedList.getSize() - 1);
        }
        return null;
    }
    public Node peek(){
        return isEmpty() ? null : linkedList.getHead();
    }

    public boolean isEmpty(){
        return linkedList.getHead() == null;
    }

    public void delete(){
        this.linkedList.setHead(null);
    }
}

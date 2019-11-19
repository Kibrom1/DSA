package com.dsa.datastructure.physicalds;

import java.util.List;

/**
* This class is used to study the properties of linked list
 * all the possible operations and details
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){

    }

    public LinkedList(Node head, Node tail){
        this.tail = tail;
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    /**
     * createSingleLinkedList(nodevalue)
     * 1. create head, tail, and initialize to null
     * 2. create a blank node
     * 3. node.value = node value
     * 4. node.next = null
     * 4. head = node;
     * 5. tail = node
     *
     * This can be summarized by creating a constructor with 3 parameters
     */
    public Node createNode(String data){
        Node node = new Node(null, null, data);
        setSize(getSize() + 1);
        return node;
    }

    /**
     * Inserting a node
     * 1. insert in first of the linked list
     * 2. insert any where in the linked list
     * 3. insert at the end of the linked list
     */

    /**
     * Insert at the beginning of  a linked list - steps
     * 1. create node - newNode
     * 2. get the next node of  head of the linked list
     * 3. set next node of the new node the next node of head
     * 4. set head the new node
     * @param data - the data of the node
     * @return the inserted node
     */
    public Node insertFirst(Node head, String data){
        Node newNode = createNode(data);
        newNode.setNext(head);
        head.setPrevious(newNode);

        setHead(newNode);

        return newNode;
    }

    /**
     * Insert at the end of the linked list - steps
     * 1. create node- newNode
     * 2. get the tail of the linked list
     * 2. set next of the tail to the new node
     * 4. set the next of the new node to null
     * @return
     */
    public Node insertLast(String data){
        Node newNode = createNode(data);

        newNode.setPrevious(getTail());
        getTail().setNext(newNode);
        setTail(newNode);

        return newNode;
    }

    /**
     * This function is used to add a node anywhere in the linked list
     * @param head - the head of the linked list
     * @param data - the data of the new node to be added
     * @param location - the location where the node will be inserted
     * @return - the inserted node
     */
    public Node insertNodeAnyWhere(Node head, String data, int location){
        if(isExistLinkedList(head)){
            System.out.println("LinkedList doesn't exist!");
            return null;
        } else{
            if(location == 0){
                return insertFirst(head, data);
            } else if(getSize() == location){
                return  insertLast(data);
            } else{
                int loc = 1;
                Node node = head;
                while(loc < location){
                    node = head.getNext();
                    loc++;
                }
                Node newNode = createNode(data);
                newNode.setNext(node.getNext().getNext());
                newNode.setPrevious(node);
                node.setNext(newNode);

                return newNode;
            }
        }
    }

    /**
     * This function is used to check if the linked list exists
     * @param head - the head of the linked list
     * @return - true if exist and false if not
     */
    public  boolean isExistLinkedList(Node head){
        return head != null;
    }

    /**
     * This function is used ot delete the entire linked list
     */
    public void deleteEntireLinkedList(){
        setHead(null);
        setTail(null);
    }

    /**
     * Insert at a specified location in the Linked list
     * 1. create node - newNode
     * 2. Iterate through the linked list until we find the location to insert
     * 3. location = find(location) - we find the node - locNode
     * 4. assign next node of newNode to locNode
     * 5. assign next node of locNode to newNode
     * @return
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkedList{");
        sb.append('}');
        return sb.toString();
    }
}

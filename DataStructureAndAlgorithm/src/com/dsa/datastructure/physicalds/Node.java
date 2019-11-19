package com.dsa.datastructure.physicalds;

public class Node {
    private Node next;
    private Node previous;
    private String data;

    Node(){

    }
    Node(Node next, Node previous, String data){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.Node;

public class CircularArrayQueue {
    private Node[] queue;
    private int start;
    private int top;

    public CircularArrayQueue(int size) {
        this.queue = new Node[size];
        this.start = -1;
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        if (this.top + 1 == start) {
            return true;
        } else if (this.start == 0 && this.top == this.queue.length) {
            return true;
        } else {
            return false;
        }
    }

    public Node enqueue(Node node) {
        if (isEmpty()) {
            start++;
        }
        if (isFull()) {
            return null;
        } else {
            if (this.top + 1 > this.queue.length) {
                this.top = 0;
            } else {
                this.top++;
            }
            this.queue[this.top] = node;

            return node;
        }
    }

    public Node dequeue() {
        Node node;
        if (isEmpty()) {
            return null;
        } else {
            node = this.queue[this.start];
            if (this.start + 1 > this.queue.length) {
                this.start = 0;
            } else if (this.start == this.top) {
                this.start = -1;
                this.top = -1;
            } else {
                this.start++;
            }
            return node;
        }
    }
}

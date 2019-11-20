package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.Node;

/**
 * First in first out (FIFO) operation
 * the following are the list of operations with Queue
 * 1. enqueue - Inserting element at the end of the queue
 * 2. dequeue - removing element from the beginning of the queue
 * 3. isEmpty - checking if the queue is empty
 * 4. isFull - check the queue if it is full
 * 5. delete - delete an element from the queue
 * 6. peek - return the top or the peek of the queue
 * 7. delete - delete the queue
 */

public class LinearArrayQueue {

    private Node[] queue;
    private int topOfQue;
    private int beginningOfQueue;

    public LinearArrayQueue(int size) {
        this.queue = new Node[size];
        this.topOfQue = -1;
        this.beginningOfQueue = -1;
    }

    public boolean isEmpty() {
        return this.beginningOfQueue == -1;
    }

    public boolean isFull() {
        return this.queue.length == topOfQue + 1;
    }

    public Node enqueue(Node node) {
        if (isFull()) {
            return null;
        }
        if (isEmpty()) {
            this.beginningOfQueue++;
        }
        this.queue[topOfQue + 1] = node;
        topOfQue++;

        return node;
    }

    public Node dequeue() {
        if (isEmpty()) {
            System.out.print("The Queue is empty");
            return null;
        } else {
            Node node = this.queue[beginningOfQueue + 1];
            this.beginningOfQueue++;
            if (this.beginningOfQueue > this.topOfQue) {
                this.beginningOfQueue = -1;
                this.topOfQue = -1;
            }
            return node;
        }
    }

    public Node peek() {
        return isEmpty() ? null : this.queue[this.beginningOfQueue];
    }

    public void delete() {
        this.queue = null;
    }
}

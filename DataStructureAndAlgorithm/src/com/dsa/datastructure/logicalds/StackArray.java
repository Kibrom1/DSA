package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.Node;

import java.lang.reflect.Array;

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
public class StackArray {
    Node[] stacks;
    int topStack;

    public StackArray(int size) {
        this.stacks = new Node[size];
        this.topStack = -1;
    }

    public Node push(Node node) {
        if (isFull()) {
            System.out.println("The stack is full");
            return null;
        }
        this.stacks[topStack + 1] = node;
        this.topStack++;

        return node;
    }

    public Node pop() {
        Node node = this.stacks[topStack + 1];
        topStack--;

        return node;
    }

    public Node peek() {
        return isEmpty() ? null : this.stacks[topStack + 1];
    }

    public boolean isEmpty() {
        return this.stacks.length == 0;
    }

    public boolean isFull() {
        return this.stacks.length == this.topStack + 1;
    }
    public void delete(){
        this.stacks = null;
        this.topStack = -1;
    }
}

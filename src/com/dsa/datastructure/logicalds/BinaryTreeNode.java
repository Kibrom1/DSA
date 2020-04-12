package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.LinkedList;

public class BinaryTreeNode {
    private String data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    
}

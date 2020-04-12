package com.dsa.datastructure.logicalds;

import com.dsa.datastructure.physicalds.LinkedList;

/**
 * In this class we will discuss and study all the operation of binary tree
 * 1. createBinaryTree
 * 2. Traverse Binary Tree
 * 3. Insert into Binary Tree
 * 4. Delete from Binary Tree
 * 5. Search Binary tree
 * 6. Delete whole Binary Tree
 * 7.
 */
public class BinaryTree {

    private BinaryTreeNode binaryTree;

    public BinaryTree(BinaryTreeNode binaryTree){
        this.binaryTree = binaryTree;
    }

    /**
     * traverses in the following order: root -> left -> right
     * @param root
     */
    public void preOrderTraverse(BinaryTreeNode root){
        if(root == null){
            System.out.println("There is an error int he Bt");
        } else{
            System.out.println(root.getData() + " ");
            preOrderTraverse(root.getLeft());
            preOrderTraverse(root.getRight());
        }
    }

    /**
     * traverses in the following order: left -> root -> right
     * @param root
     */
    public void inOrderTraverse(BinaryTreeNode root){
        if(root == null){
            System.out.println("The node is null");
        } else{
            inOrderTraverse(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderTraverse(root.getRight());
        }
    }

    /**
     * traverse in the following order: left -> right -> root
     * @param root
     */
    public void postOrderTraverse(BinaryTreeNode root){
        if(root == null){
            System.out.print("The node is null");
        } else{
            postOrderTraverse(root.getLeft());
            postOrderTraverse(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

}

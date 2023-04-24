package com.mycompany.csc229_bst_example;
/**
 *
 * @author MoaathAlrajab
 */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BstNode root;
    

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Integer data) {

        System.out.print("[input: " + data + "]");
        if (root == null) {
            this.root = new BstNode(data);
            System.out.println(" -> inserted: " + data);
            return;
        }
        insertNode(this.root, data);
        System.out.print(" -> inserted: " + data);
        System.out.println();
    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;
        System.out.print(" ->" + root.getData());
        if (root.getData() >= data) {
            System.out.print(" [L]");
            if (root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            System.out.print(" [R]");
            if (root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    private void doInOrder(BstNode root) {

        // ToDo 1: complete InOrder Traversal 
        if(root == null)return;
        doInOrder(root.getLeft());
        System.out.println(root.getData());
        doInOrder(root.getRight());
    }
    private void doPreOrder(BstNode root){
        if(root == null)return;
        System.out.println(root.getData());
        doPreOrder(root.getLeft());
        doPreOrder(root.getRight());
    }
    public void preOrderTraversal() {
        doPreOrder(this.root);
        // ToDo 2: complete the pre-order travesal . 
    }

    public Integer findHeight() {
        // ToDo 3: Find the height of a tree
       int height = 0;
       int left = 0;
       int right = 0;
       BstNode leftNode = this.root;
       while(leftNode != null){
           leftNode = leftNode.getLeft();
           left++;
       }
       BstNode rightNode = this.root;
       while(rightNode != null){
           rightNode = rightNode.getRight();
           right++;
       }
       
       return height = left > right ? left:right;
    }
  

    public int getDepth(BstNode node) {
        //ToDo 4: complete getDepth of a node 
        int depth =0;
        BstNode current = root;
        while(current != null){
            if(node.getData() < current.getData()){
                current = current.getLeft();
                depth++;
            }
            else if(node.getData()> current.getData()){
                current = current.getRight();
               depth++;
            }else{
                return depth;
            }            
        }
        return -1;
    }
    
   public void print() {
       System.out.println("\n==== BST Print ===== \n");
        print("", root,false);
        // ToDo 5: complete the print of the BST
    }
   
   public void print(String prefix, BstNode node, boolean isLeft) {
    if (node == null) {
        return;
    }

    System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + node.getData());

    String newPrefix = prefix + (isLeft ? "|   " : "    ");
    print(newPrefix, node.getLeft(), true);
    print(newPrefix, node.getRight(), false);
}



}

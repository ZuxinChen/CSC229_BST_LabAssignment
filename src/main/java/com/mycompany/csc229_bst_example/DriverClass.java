/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_bst_example;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    public static void main(String a[]) {
 
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("\n-------------------");
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        
        bst.print();
        System.out.println("height:"+ bst.findHeight());
        System.out.println("depth of 10:"+ bst.getDepth(new BstNode(10)));
    }
}
/*
In Order Traversal
1
3
4
6
7
8
10
13
14

==== BST Print ===== 

\-- 8
    |-- 3
    |   |-- 1
    |   \-- 6
    |       |-- 4
    |       \-- 7
    \-- 10
        \-- 14
            |-- 13
height:3
depth of 10:1
*/

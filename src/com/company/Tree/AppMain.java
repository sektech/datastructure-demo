package com.company.Tree;

public class AppMain {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insertNode(80);
        tree.insertNode(90);
        tree.insertNode(70);
        tree.insertNode(95);
        tree.insertNode(60);
        tree.insertNode(58);
        tree.traverse();
        tree.deleteNode(60);
        System.out.println();
        tree.traverse();
    }
}

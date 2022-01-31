package com.company.Tree;

public class BinaryTree {
    private TreeNode root;

    public void insertNode(int value){
        if(root == null){
            root = new TreeNode();
            root.val =value;
        }else
        {
            insertNodeRec(root, value);
        }
    }

    public void traverse(){
        travePre(root);
        System.out.println();
        //travePost(root);
    }

    private void travePre(TreeNode node){
        if(node == null) return;
        System.out.print(node.val + " ");
        travePre(node.left);
        travePre(node.right);
    }
    private void travePost(TreeNode node){
        if(node == null) return;
        travePost(node.left);
        travePost(node.right);
        System.out.print(node.val + " ");
    }

    public void deleteNode(int value){
         deleteRecursive(root,value);
    }
    private  TreeNode deleteRecursive(TreeNode node,int value){
        if(node == null)
            return node;
        if(value < node.val)
           node.left= deleteRecursive(node.left,value);
        else if(value > node.val)
            node.right = deleteRecursive(node.right,value);
        else {
            if(node.left == null)
                return node.right;
            else if(node.right==null)
                return node.left;
        }
        return node;
    }

    private void insertNodeRec(TreeNode node,int value){
        TreeNode temp = new TreeNode();
        if(node == null) return;
        if(value < node.val){
           if(node.left == null){
               temp.val = value;
               node.left = temp;
           }else {
               insertNodeRec(node.left,value);
           }

        }else {
            if(node.right == null){
               temp.val = value;
                node.right = temp;

            }else {
                insertNodeRec(node.right,value);
            }

        }
    }
}

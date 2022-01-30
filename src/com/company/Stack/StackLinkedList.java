package com.company.Stack;

public class StackLinkedList {

    private Node head;
    private Node tail;

    public StackLinkedList(){
        head = null;
        tail = null;
    }

    public void push(int value){
        Node newNode = new Node();
        newNode.val = value;
        newNode.next = head;
        head = newNode;
    }
    public int peek(){
        return(head !=null? head.val :0);

    }
    public int pop(){
        Node currentNode = new Node();
        currentNode=head;
        int removedValue=-1;
        if(head!=null){
            removedValue = head.val;
            head = head.next;
        }

        return removedValue;
    }

    public void print(){
        Node currentNode = new Node();
        currentNode=head;
        System.out.print("Head-->");
        while(currentNode!=null){
            System.out.print(currentNode.val + "-->");
            currentNode = currentNode.next;
        }
        System.out.print("Null");
    }
}

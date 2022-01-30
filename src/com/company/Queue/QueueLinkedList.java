package com.company.Queue;

public class QueueLinkedList {
    private Node head;
    private Node tail;

    public void Enqueue(int value){
        Node newNode = new Node();
        newNode.val=value;

        newNode.next=head;
        head = newNode;
    }
    public void DeQueue(){
        Node currentNode = head;
        Node previous = currentNode;
        while(currentNode.next !=null){
            previous = currentNode;
            currentNode = currentNode.next;
        }
        previous.next=null;
    }
    public void traverse(){
        Node currentNode = head;

        System.out.print("Head-->");
        while(currentNode!=null){
            System.out.print(currentNode.val + "-->");
            currentNode = currentNode.next;
        }
        System.out.print("Null");
    }

}

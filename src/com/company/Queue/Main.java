package com.company.Queue;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList queu = new QueueLinkedList();
        queu.Enqueue(20);
        queu.Enqueue(30);
        queu.Enqueue(40);
        queu.Enqueue(50);
        queu.Enqueue(60);
        queu.traverse();
        queu.DeQueue();
        queu.DeQueue();
        System.out.println();
        queu.traverse();

        /* Queue with Array implementation
        QueueArray queu = new QueueArray(5);
        System.out.print("\n Empty Queue: " + queu.isEmpty());
        System.out.print("\n Is Queue Full: " + queu.isFull()+"\n");
        queu.enqueue(20);
        queu.enqueue(30);
        queu.enqueue(40);
        queu.enqueue(50);
        queu.enqueue(60);
        queu.enqueue(80);
        System.out.println("Printing Queue");
        queu.print();
        System.out.println();
        queu.deque();
        queu.deque();
        System.out.println("Printing Queue");
        queu.print();
    */
    }
}

package com.company.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StackLinkedList stack = new StackLinkedList();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        System.out.print("\n Peek value :" + stack.peek()+"\n" );
        stack.pop();
        stack.print();
        System.out.print("\n Peek value :" + stack.peek() );
    }
}

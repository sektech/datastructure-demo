package com.company.Queue;

public class QueueArray {

    private int[] array;
    private int beginingOfQueue;
    private int topOfQueue;

    public QueueArray(int size){
        array = new int[size];
        beginingOfQueue=-1;
        topOfQueue=-1;
    }
    public boolean isEmpty(){
        return (beginingOfQueue == -1);
    }
    public boolean isFull(){
        return(topOfQueue == array.length-1);
    }

    public void enqueue(int value){
        if(isEmpty()){
            beginingOfQueue=0;
            topOfQueue++;
            array[topOfQueue]=value;
        }else {
            if(!isFull()){
                topOfQueue++;
                array[topOfQueue]=value;
            }else
                System.out.println("Queue is full");

        }
    }
    public int deque(){
        int result=0;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else {
            result = array[beginingOfQueue];
            beginingOfQueue++;
            if(beginingOfQueue>topOfQueue){
                beginingOfQueue=topOfQueue=-1;
            }
        }
      return result;
    }
    public void print(){
        for (int i = topOfQueue; i >= beginingOfQueue ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

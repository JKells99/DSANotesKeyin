package Queues;

import java.util.Queue;

public class QueueArray {
    private int[] arr;
    private int backOfQueue;
    private int nItems;
    private int beginingOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginingOfQueue = -1;
        this.nItems = 0;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    //isFull
    public boolean isFull(){
        if (backOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else if (isEmpty()){
            beginingOfQueue = 0;
            backOfQueue++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + "in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + "in the queue");
        }
    }

    public int deQueue() {
        int result = 0;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            result = arr[beginingOfQueue];
            beginingOfQueue++;
            if (beginingOfQueue > backOfQueue) {
                beginingOfQueue = backOfQueue = -1;
            }
            nItems--;
        }
        return result;
    }

    public int peek(){
        if (!isEmpty()){
            System.out.println("The stack is empty");
            return arr[beginingOfQueue];
        } else {
            System.out.println("The queue is empty");
            return -1;
        }
    }

    //delete
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully delete");
    }
}

/**
 * An Animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" bases.
 * People must adopt either the "oldest" (based on arrival time) of  all animals at the shelter, or they can select
 *  whether they would prefer a dog or cat (and will receive the oldest animal of that type).
 *  They cannot select which specific animal they would like.
 *  Create a datastucture to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and DequeueCat.
 */
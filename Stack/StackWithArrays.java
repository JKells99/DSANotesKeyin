package Stacks;

import java.util.Stack;

public class StackWithArrays {
    int [] arr;
    int topOfStack;

    public StackWithArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size of: " + size);
    }


    //isEmpty
    public boolean isEmpty(){
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // isFull
    public boolean isFull(){
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //Push
    public void push (int value) {
        if (isFull()){
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Successfully inserted");
        }
    }

    //pop
    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return  topStack;
        }
    }

    //peek
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

}
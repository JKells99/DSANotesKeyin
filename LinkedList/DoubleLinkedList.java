package DoubleLinkedList;

import LinkedList.Node;

public class DoubleLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    //create a linked list
    public DoublyNode createdLinkedList (int nodeValue) {

        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    //Insert int linked list
    //0. if the link doesn't
    //1. inserting at the begining
    //2. inserting at the ending
    //3. inserting anywhere

    public void insertInLinkedList(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createdLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.previous = null;
            head.previous = tail;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.previous = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.previous = newNode;
        }
        size++;
    }

    // Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            DoublyNode temNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if (i != size -1 ){
                    System.out.print(" <-> ");
                }
                temNode = temNode.next;
            }
            System.out.print("\n");
        }
    }

    // Traverse a Linked List
    public void reverseTraverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            DoublyNode temNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if (i != size -1 ){
                    System.out.print(" <- ");
                }
                temNode = temNode.previous;
            }
            System.out.print("\n");
        }
    }

    // search for a Node
    public boolean searchNode (int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }


    // Deletion Method
    public void deleteNodeDLL(int location) {
        if (head == null) {
            System.out.println("The DLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.previous = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.previous;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }
    // Delete the entire DLL
    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i =0; i< size; i++) {
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been deleted!");
    }

}


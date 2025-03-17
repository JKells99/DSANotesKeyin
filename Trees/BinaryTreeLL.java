package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    //Tree traversal
    //preorder
    public void preOrder(BinaryNode node){
        if (node == null){
            return;
        }
        System.out.println(node.value + " "); //root
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder
    public void inOrder(BinaryNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " "); //root
        inOrder(node.right);
    }

    //postorder
    public void postOrder(BinaryNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " "); //root
    }

    public void search (String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value-" + value + "  is found in the Tree");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
            System.out.println("The value-" + value + "  is not found in the Tree");
        }
    }

    //Insert Method
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null){
            root = newNode;
            System.out.println("Insert new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("successfully Inserted");
                break;
            } else if (presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("successfully Inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);

            }
        }
    }

    //1. create a binary tree
    //.Insert of a BT
    //Delete a BT
    //Search for a value
    //Traversal of BT


    //Breadth first search
    //Level

    //Test Exercise
    //. complete Level order Traversal
    //Delete a node in a BT
    //Delete an entire BT

}

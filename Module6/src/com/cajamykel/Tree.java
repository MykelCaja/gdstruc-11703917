package com.cajamykel;

public class Tree {
    public Node root;

    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }

        else{
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public Node get(int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    //Keep digging until null is reached.
    public Node getMin(){
        Node current;
        while(root.getLeftChild() != null){
            current = root.getLeftChild();
        }
        return current;
    }

    public Node getMax(){
        Node current;
        while(current.getRightChild() != null){
            current = current.getRightChild();
        }
        return current;
    }
}

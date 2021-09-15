package com.cajamykel;
import java.io.*;
import java.util.LinkedList;
import java.util.Objects;

public class PlayerLinkedList {
    private PlayerNode head;
    public int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Player player) {
        size++;
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFront() {
        size--;
        head = head.getNextPlayer();
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD ↓ ");
        System.out.println();
        while (current != null) {
            System.out.print(current.getPlayer() + " ↓ ");
            System.out.println();
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("The size of the linked list is: " + size);
        System.out.println();
    }

    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer() == player) {
                System.out.println("True");
                return true;
            }
            current = current.getNextPlayer();
        }
        System.out.println("False");
        return false;
    }


//    public int indexOfElement(Player player) {
//        PlayerNode current = head;
//        int counter = -1;
//        while (current != null) {
//            counter++;
//            if (current.getPlayer() == player) {
//                System.out.println("Index: " + counter);
//            }
//        }
//        return counter;
//    }
}


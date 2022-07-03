import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Singly_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void Creation(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void traversal() {
        Node temp = head;
        if (head == null)
            System.out.println("Linkedlist does not exist");
        else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Singly_LinkedList ll = new Singly_LinkedList();
        ll.Creation(1);
        ll.Creation(2);
        ll.Creation(3);
        ll.Creation(4);
        ll.Creation(5);

        ll.traversal();
    }
}

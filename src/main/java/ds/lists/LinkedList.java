package ds.lists;

public class LinkedList extends List {

    Node head;

     public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

}

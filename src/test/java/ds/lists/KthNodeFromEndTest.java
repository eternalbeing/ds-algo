package ds.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthNodeFromEndTest {

    KthNodeFromEnd service = new KthNodeFromEnd();

    @Test
    void getNode() {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node node3 = new LinkedList.Node(3);
        LinkedList.Node node4 = new LinkedList.Node(4);
        LinkedList.Node node5 = new LinkedList.Node(5);
        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        int result = service.getNode(list.head, 2);
        int result1 = service.getNode(list.head, 4);
        assertEquals(4, result);
        assertEquals(2, result1);


    }
}
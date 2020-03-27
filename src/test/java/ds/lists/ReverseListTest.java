package ds.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseListTest {

    ReverseList service = new ReverseList();

    @Test
    void reverse() {
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
        LinkedList.Node result = service.reverse(list.head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, service.toArray(result));


    }
}
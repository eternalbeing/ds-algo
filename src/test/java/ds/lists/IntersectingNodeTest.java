package ds.lists;

import org.junit.jupiter.api.Test;
import sun.awt.image.ImageWatched;

import static org.junit.jupiter.api.Assertions.*;

class IntersectingNodeTest {

    IntersectingNode service = new IntersectingNode();

    @Test
    void getCommonNode() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[]{2, 6, 8, 2, 20, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList list1 = createList(arr);
        LinkedList list2 = createList(arr1);

        list1.head.next = list2.head.next.next.next;

        LinkedList.Node result = service.getCommonNode(list1.head, list2.head);
        assertEquals(2, result.data);


    }

    @Test
    void printListTest() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        LinkedList list = createList(arr);
        new IntersectingNode().printElements(list.head);

    }

    private LinkedList createList(int[] arr) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(arr[0]);
        LinkedList.Node temp = list.head;
        for (int i = 1; i < arr.length; i++) {
            LinkedList.Node node = new LinkedList.Node(arr[i]);
            temp.next = node;
            temp = node;
        }
        return list;
    }
}
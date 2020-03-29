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
        LinkedList list1 = service.createList(arr);
        LinkedList list2 = service.createList(arr1);

        list1.head.next = list2.head.next.next.next;

        LinkedList.Node result = service.getCommonNode(list1.head, list2.head);
        assertEquals(2, result.data);


    }

}
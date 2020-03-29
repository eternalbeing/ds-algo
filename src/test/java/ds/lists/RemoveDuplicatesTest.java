package ds.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates service = new RemoveDuplicates();

    @Test
    void removeDuplicates() {
        int[] arr = new int[]{5, 4, 3, 5, 3, 2, 2, 1, 8};
//        int[] arr = new int[]{5};
        LinkedList list = service.createList(arr);
        LinkedList.Node head = service.removeDuplicates(list.head);
        int[] resultingArray = service.toArray(head);
        int[] expectedArray = new int[]{5};
        assertArrayEquals(expectedArray, resultingArray);
    }
}
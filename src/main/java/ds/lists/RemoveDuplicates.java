package ds.lists;


import java.util.HashSet;
import java.util.Set;

/**
 * Write a function which takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. The list should only be traversed once.
 * For example if the linked list is 11->11->11->21->43->43->60 then removeDuplicates() should convert the list to 11->21->43->60.
 */
public class RemoveDuplicates extends  List{

    public LinkedList.Node removeDuplicates(LinkedList.Node node) {
        LinkedList.Node prev = null;
        LinkedList.Node head = node;
        Set<Integer> set = new HashSet<>();

        while (head != null) {
            if (!set.contains(head.data)) {
                set.add(head.data);
                prev = head;
                head = head.next;
            } else {
                set.remove(head.data);
                prev.next = head.next;
                head = head.next;
            }

        }

        return node;
    }

}

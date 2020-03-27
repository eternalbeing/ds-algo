package ds.lists;

public class ReverseList extends List {

    public LinkedList.Node reverse(LinkedList.Node head) {
        LinkedList.Node prev = null, next;
        LinkedList.Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}

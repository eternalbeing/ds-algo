package ds.lists;

public class KthNodeFromEnd extends List{


    public int getNode(LinkedList.Node head, int k) {

        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        int count = 1;

        while (fast.next != null) {
            fast = fast.next;
            count++;

            if (count > k) {
                slow = slow.next;
            }
        }
        return slow.data;

    }


}

package ds.lists;

public class DetectLoop extends List{

    public boolean isLoop(LinkedList.Node head) {

        LinkedList.Node slow = head, fast = head;
        int count = 0;
        while (fast.next != null) {
            fast = fast.next;
            count++;
            if (count % 2 == 0) {
                slow = slow.next;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

}

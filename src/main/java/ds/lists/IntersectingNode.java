package ds.lists;

import java.util.HashSet;
import java.util.Set;

public class IntersectingNode extends List {

    public LinkedList.Node getCommonNode(LinkedList.Node head1, LinkedList.Node head2) {

        Set<LinkedList.Node> set = new HashSet<>();
        LinkedList.Node temp1 = head1;
        LinkedList.Node temp2 = head2;
        while (temp1 != null) {
            set.add(temp1);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (set.contains(temp2)) return temp2;
            temp2 = temp2.next;
        }
        return null;

    }

}

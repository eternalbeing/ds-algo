package ds.lists;

/**
 * Merge two sorted linked lists and return the head of the new sorted list.
 * <p>
 * Input: A = 1->2->4 and B = 1->3->4
 * Output: 1->1->2->3->4->4
 * Input: A = 6->25 and B = 1->3->4
 * Output: 1->3->4->6->25
 */
public class MergeLists {

    public LinkedList.Node sortedMerge(LinkedList.Node h1, LinkedList.Node h2) {

        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }

        LinkedList.Node node = new LinkedList.Node();
        LinkedList.Node temp = node;

        while (true){

            if(h1.data < h2.data){
                LinkedList.Node aTemp = h1;
                h1 = h1.next;

                temp = aTemp;

            }

        }


    }
}

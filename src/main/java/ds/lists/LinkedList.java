package ds.lists;

class LinkedList {

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private void printListElements(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
    }
    private Node reverse(Node head) {
        Node prev = null, next = null;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        printListElements(prev);
        return prev;
    }
    private int getKthNodeFromEnd(Node head, int k) {

        Node slow = head;
        Node fast = head;
        int count = 1;

        while(fast.next != null) {
            fast = fast.next;
            count++;

            if(count > k) {
                slow = slow.next;
            }
        }
        System.out.println(slow.data);
        return slow.data;

    }
    private void mergeTwoSortedLists(Node head1, Node head2){
        printListElements(head1);
        System.out.println();
        printListElements(head2);




    }
    private boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        int count = 1;
        while(slow!=null){
            slow = slow.next;
            if(count%2==0){
                fast = fast.next;
            }
            if(slow == fast) return true;
            count++;

        }
        return false;
    }
    private void getIntersectingNode(Node head1, Node head2){

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.head = new Node(0);
        Node first = new Node(3);
        Node second = new Node(6);
        Node third = new Node(9);

        list.head.next = first;
        first.next = second;
        second.next = third;

        LinkedList list1 = new LinkedList();
        list1.head = new Node(1);
        Node first1 = new Node(2);
        Node second1 = new Node(5);
        Node third1 = new Node(8);

        list1.head.next = first1;
        first1.next = second1;
        second1.next = third1;

        list.head.next.next.next = list.head;

        LinkedList functions = new LinkedList();
//        functions.reverse(list.head);
//        functions.getKthNodeFromEnd(list.head, 2);
//        functions.mergeTwoSortedLists(list.head, list1.head);
        System.out.println(functions.detectLoop(list1.head));

    }
}




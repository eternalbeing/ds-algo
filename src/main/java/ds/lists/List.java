package ds.lists;

public abstract class List {

    public void printElements(LinkedList.Node head) {
        LinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int[] toArray(LinkedList.Node head){
        LinkedList.Node temp = head;
        int len = 0;
        while (temp != null){
            len++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            arr[i] = temp.data;
            temp = temp.next;
        }

        return arr;
    }
}

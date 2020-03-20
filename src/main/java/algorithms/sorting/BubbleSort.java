package algorithms.sorting;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int j = arr.length;
        while (j >= 0) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            j--;
        }
        return arr;
    }
}

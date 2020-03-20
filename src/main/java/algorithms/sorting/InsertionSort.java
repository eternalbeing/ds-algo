package algorithms.sorting;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int j = 1;
        while (j < arr.length) {
            for (int i = j - 1; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            j++;
        }
        return arr;
    }
}

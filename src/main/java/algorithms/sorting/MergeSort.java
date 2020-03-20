package algorithms.sorting;

public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }
    }

    private void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }

    }
}

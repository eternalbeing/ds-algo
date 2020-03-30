package algorithms.binarysearch;

public class RotatedSortedArray {


    /**
     * Find minimum element in rotated sorted array
     *
     * @param arr
     * @return
     */
    public int minimumElement(int[] arr) {
        int low = 0, high = arr.length - 1;
        if (high == low) return arr[low];

        while (true) {
            int mid = low + (high - low) / 2;
            if (mid == 0 && high >= low) {
                return (arr[mid] > arr[high] ? arr[high] : arr[mid]);
            }
            if (arr[mid - 1] > arr[mid])
                return arr[mid];
            else {
                if (arr[mid] < arr[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

    }


    /**
     * Given an array of integers A of size N and an integer B.
     * <p>
     * array A is rotated at some pivot unknown to you beforehand.
     * <p>
     * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).
     * <p>
     * You are given a target value B to search. If found in the array, return its index, otherwise return -1.
     * <p>
     * You may assume no duplicate exists in the array
     *
     * @param A
     * @param B
     * @return
     */
    public int findElement(int[] A, int B) {

        int low = 0;
        int high = A.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (A[mid] == B) {
                return mid;
            }
            if (A[low] <= A[mid]) {
                if (A[low] <= B && B < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] < B && B <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}


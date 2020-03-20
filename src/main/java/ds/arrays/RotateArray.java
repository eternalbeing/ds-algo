package ds.arrays;


/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 */
public class RotateArray {

    public int[] rotateLeftByK(int[] arr, int k){

        for(int i = 0; i < k; i++){
            int j =0, first;
            first = arr[0];

            for (j=0; j< arr.length -1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
            printArray(arr);
        }

        return arr;
    }

    private void printArray(int[] arr) {

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}

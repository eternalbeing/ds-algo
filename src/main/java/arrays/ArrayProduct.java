package arrays;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i]
 * <p>
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 */
public class ArrayProduct {

    public int[] arrayProductExceptSelf(int[] arr) {
        printArray(arr);
        int n = arr.length;
        int[] out = new int[n];

        out[0] = 1;

        for (int i = 1; i < n; i++) {
            out[i] = out[i - 1] * arr[i - 1];
        }
        printArray(out);
        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            out[i] = out[i] * temp;
            temp = temp * arr[i];
        }
        printArray(out);
        return out;
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

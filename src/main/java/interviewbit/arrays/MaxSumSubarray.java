package interviewbit.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Kaden's Algorithm
 * <p>
 * Find the contiguous subarray within an array, A of length N which has the largest sum
 * <p>
 * Input 1:
 * A = [1, 2, 3, 4, -10]
 * <p>
 * Output 1:
 * 10
 * <p>
 * Input 2:
 * A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * <p>
 * Output 2:
 * 6
 */
public class MaxSumSubarray {

    /**
     * Returns the max sum
     *
     * @param A
     * @return
     */
    public int maxSubArray(final int[] A) {

        int maxSoFar = A[0], maxEndingHere = A[0];
        for (int i = 0; i < A.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }


    /**
     * Given an array arr[] containing n integers. The problem is to find the length of the subarray having maximum sum. If there exists two or more subarrays with maximum sum then print the length of the longest subarray.
     * <p>
     * Input : arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}
     * Output : 5
     * The subarray is {4, -1, -2, 1, 5}
     *
     * @param A
     * @return
     */
    public int[] longestSubArrayWithMaxSum(int[] A) {
        int[] out;
        int beg = 0, start = 0, end = 0;
        int maxSoFar = 0, maxEndingHere = 0;

        for (int i = 0; i < A.length; i++) {
            maxEndingHere = maxEndingHere + A[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                beg = i + 1;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = beg;
                end = i;
            }
        }

        out = new int[end - start + 1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            out[j] = A[i];
            j++;
        }
        return out;
    }

    public int[] maxSumSubArrayNonNegativeIntegers(int[] A) {
        int[] out = new int[A.length];

        int maxEndingHere = 0, maxSoFar = 0;
        int begin = 0, end = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                begin++;
            } else {
                maxEndingHere = maxEndingHere + A[i];
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
        }

        return out;
    }
}

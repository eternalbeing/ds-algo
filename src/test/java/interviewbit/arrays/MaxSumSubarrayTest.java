package interviewbit.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubarrayTest {

    MaxSumSubarray service = new MaxSumSubarray();

    @Test
    public void test(){
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = service.maxSubArray(A);
        assertEquals(6, result);
    }

    @Test
    public void testMaxSumSubArray(){
        int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] result = service.longestSubArrayWithMaxSum(A);
        int[] expected = {4, -1, -2, 1, 5};
        assertArrayEquals(expected, result);
    }

}
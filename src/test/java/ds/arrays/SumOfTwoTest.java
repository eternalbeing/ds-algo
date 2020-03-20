package ds.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {
    SumOfTwo service = new SumOfTwo();

    @Test
    public void sumOfTwoSortedArray() {
        int[] arr = {2, 7, 11, 15};
        int sum = 18;
        int[] result = service.findSumInSortedArray(arr, sum);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void sumOfTwoUnsortedArray(){
        int[] arr = {3, 5, 2, -4, 8, 11};
        int sum = 7;
        List<int[]> result = service.sumofTwoInUnsortedArray(arr, sum);
        assertEquals(2, result.size());
        assertArrayEquals(new int[]{5, 2}, result.get(0));
        assertArrayEquals(new int[]{-4, 11}, result.get(1));

    }
}
package ds.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray service = new RotateArray();

    @Test
    public void rotateLeftByK(){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int[] result = service.rotateLeftByK(arr, k);
        int[] expected = {4,5,6,7,1,2,3};
        assertArrayEquals(expected, result);
    }

}
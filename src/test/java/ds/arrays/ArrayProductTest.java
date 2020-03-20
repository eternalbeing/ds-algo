package ds.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayProductTest {

    ArrayProduct service = new ArrayProduct();

    @Test
    public void productExceptSelf() {

        int[] arr = {1, 2, 3, 4};
        int[] result = service.arrayProductExceptSelf(arr);
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, result);

    }

}
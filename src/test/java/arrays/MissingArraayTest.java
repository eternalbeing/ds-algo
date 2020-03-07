package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingArraayTest {

    MissingArraay service = new MissingArraay();

    @Test
    public void missingNumberTest() {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result = service.missingNumber(arr);
        assertEquals(8, result);
    }

    @Test
    public void missingMultipleNumbers() {
        int[] input = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
        int[] result = service.missingMultipleNumbers(input);
        assertEquals(4, result[0]);


    }

}
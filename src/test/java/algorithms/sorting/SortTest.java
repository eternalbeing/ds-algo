package algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    int[] arr = {2,7,1,3,9,5};
    int[] expected = {1,2,3,5,7,9};

    @Test
    public void testBubbleSort(){
        testService(new BubbleSort());
    }

    @Test
    public void testInsertionSort() {
        testService(new InsertionSort());
    }

    @Test
    public void testMergeSort(){
        testService(new MergeSort());
    }

    private void testService(Sort service){
        int[] result = service.sort(arr);
        assertArrayEquals(expected, result);
    }

}
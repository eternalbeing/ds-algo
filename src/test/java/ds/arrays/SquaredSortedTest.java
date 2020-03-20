package ds.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredSortedTest {

    SquaredSorted service = new SquaredSorted();

    @Test
    public void sqauredSort() {
      int[] arr = {-6,-4,1,3,6,7};
      int[] expected = {1,9,16,36,36,49};
      int[] result = service.squaredSort(arr);
      assertArrayEquals(expected, result);
    }

}
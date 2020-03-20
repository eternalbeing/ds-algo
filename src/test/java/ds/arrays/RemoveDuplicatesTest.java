package ds.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates service = new RemoveDuplicates();

    @Test
    public void removeDuplicates(){

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr1 = {1,1,2};
        int[] result = service.removeDuplicates(arr);
        int[] result1 = service.removeDuplicates(arr1);
        int[] uniqueNumResult = new int[5];
        int[] uniqueNumResult1 = new int[2];
        for(int i=0; i<5; i++){
            uniqueNumResult[i] = result[i];
        }
        for(int i=0; i<2; i++){
            uniqueNumResult1[i] = result1[i];
        }
        int[] expected = {0,1,2,3,4};
        int[] expected1 = {1,2};
        assertArrayEquals(expected, uniqueNumResult);
        assertArrayEquals(expected1, uniqueNumResult1);

    }

}
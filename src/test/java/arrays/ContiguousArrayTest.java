package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

    ContiguousArray service = new ContiguousArray();

    @Test
    public void test0sand1s(){
        int[] arr = {0,0,1,0,0,0,1,1};
        int result = service.subarray0sand1s(arr);
        assertEquals(6, result);
    }

    @Test
    public void testEvenandOdd(){
        int[] arr = {2,4,1,6,12,20,13,11};
        int result = service.subarrayEvenAndOdd(arr);
        assertEquals(6, result);
    }

    @Test
    public void getSubrrayIndices(){
        int[] arr = {0,0,1,0,0,0,1,1};
        int[] result = service.getSubArrayIndicesForMax0sAnd1s(arr);
        assertEquals(2, result[0]);
        assertEquals(7, result[1]);
    }

}
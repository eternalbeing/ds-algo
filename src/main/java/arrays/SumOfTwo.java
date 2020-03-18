package arrays;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * find 2 numbers in a sorted array that sum to M
 */
public class SumOfTwo {

    public int[] findSumInSortedArray(int[] arr, int sum) {

        int[] out = new int[2];

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int presentSum = arr[start] + arr[end];
            if (presentSum == sum) {
                out[0] = start;
                out[1] = end;
                break;
            }
            if (presentSum < sum) {
                start++;
            } else {
                end--;
            }
        }

        return out;

    }


    public List<int[]> sumofTwoInUnsortedArray(int[] arr, int sum) {

        ArrayList<int[]> out = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            int complement = sum - arr[i];
            if(map.containsKey(complement)){
                out.add(new int[]{arr[map.get(complement)], arr[i]});
            }
            map.put(arr[i], i);
        }

        return out;
    }

}

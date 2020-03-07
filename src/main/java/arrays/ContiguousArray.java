package arrays;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    /**
     * Problem Statement:  {@link "https://leetcode.com/articles/contiguous-array/"}
     * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1
     */


    public int subarray0sand1s(int[] arr) {

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            count = count + (arr[i] == 0 ? -1 : 1);
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public int subarrayEvenAndOdd(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            count = count + ((arr[i]%2) == 0 ? 1 : -1);
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return maxLength;
    }

    public int[] getSubArrayIndicesForMax0sAnd1s(int[] arr){
        int[] res = new int[2];

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int endIndex = 0;
        int count = 0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            count = count + (arr[i] == 0 ? -1 : 1);
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
                endIndex = i;
            } else {
                map.put(count, i);
            }
        }

        int startIndex = 1 -maxLength + endIndex;

        res[0] = startIndex;
        res[1] = endIndex;
        return res;
    }

}

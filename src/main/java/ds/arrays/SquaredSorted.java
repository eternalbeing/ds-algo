package ds.arrays;

public class SquaredSorted {

    public int[] squaredSort(int[] arr) {

        int n = arr.length;
        int[] res = new int[n];

        int low = 0;
        int high = n-1;

        for(int i=high; i>=0; i--){
            if(Math.abs(arr[low]) > Math.abs(arr[high])){
                res[i] = arr[low] * arr[low];
                low++;
            }else {
                res[i] = arr[high] * arr[high];
                high--;
            }
        }

        return res;

    }
}

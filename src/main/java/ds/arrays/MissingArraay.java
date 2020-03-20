package ds.arrays;

public class MissingArraay {

    public int missingNumber(int[] nums) {

        int n = nums.length -1 ;

        int sum = (n*(n+1))/2;

        int actualSum = 0;

        for(int i=1; i<=n; i++){
            actualSum = actualSum + nums[i];
        }

        return sum - actualSum;

    }


    // Fill the missing numbers in the array of N natural numbers
    public int[] missingMultipleNumbers(int[] nums ){

        int n = nums.length;
        int[] result = new int[n];
        int[]  register = new int[n];

        // fill the result array with numbers present in input and mark them 1
        for(int num : nums){
            register[num] = 1;
        }

        int j =0;
        for(int i=1; i<n; i++){
            if(register[i] == 0){
                result[j] = i;
                j++;
            }

        }

        return result;

    }
}

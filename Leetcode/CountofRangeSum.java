import java.util.Arrays;

public class CountofRangeSum {
    public static void main(String[] args) {
        // can't use partial sums, numbers are too big ;(
        System.out.println(countRangeSum(new int[]{-2147483647,0,-2147483647,2147483647}, -564, 3864));

    }
    public static int countRangeSum(int[] nums, int lower, int upper) {
        int[] sums = new int[nums.length  + 1 ];
        int s = 0;
        for(int i = 0 ; i < nums.length; i++){
            sums[i+1] = sums[i] + nums[i];

        }
        int nrOfSums = 0;
        System.out.println(Arrays.toString(sums));
        for(int i = 0 ; i < nums.length + 1; i++){
            for(int j = i + 1; j < nums.length +1 ; j++){
                if( lower <= sums[j] - sums[i] && sums[j] - sums[i] <= upper)
                    nrOfSums++;

            }

        }
        return nrOfSums;
    }


    static int binarySearch(int[] nums, int target){
        int left = 0 ;
        int right = nums.length - 1;
        while(left <= right){
            int m =  ( left + right) / 2;
            if(nums[m] == target)
                return m;
            if(nums[m] > target)
                right = m - 1;
            else
                left = m + 1;
        }
        return left;

    }
}

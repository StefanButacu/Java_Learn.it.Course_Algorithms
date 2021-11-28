/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int p = 1;
        int[] leftP = new int[nums.length];
        int[] rightP = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            p = p * nums[i];
            leftP[i] = p;

        }
        p = 1;
        for(int i = nums.length - 1 ; i >= 0;i--){
            p = p * nums[i];
            rightP[i] = p;
        }
        ans[0] = rightP[1];
        ans[nums.length-1] = leftP[nums.length-2];
        for(int i = 1; i < nums.length-1; i++){
            ans[i] = leftP[i-1] * rightP[i+1];

        }

        return ans;
    }
}

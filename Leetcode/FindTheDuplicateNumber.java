public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(nums));


    }
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        int pos = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
            pos++;
        }
        return nums[pos];
    }
}

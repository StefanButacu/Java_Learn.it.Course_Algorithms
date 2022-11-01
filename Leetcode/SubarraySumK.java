import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,2));
    }
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
        int sum = 0;
        int nr = 0;
        sums.put(0,1);
        for(int num : nums){
            sum += num;
            if(sums.get(sum - k) != null){
                nr += sums.get(k - sum);
            }
            sums.put(sum, sums.getOrDefault(sum, 0) + 1);

        }
        return nr;

    }
}

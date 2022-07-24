import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> numsFrq = new HashMap<>();
        Map<Integer, Integer> firstApparition = new HashMap<>();
        Map<Integer, Integer> lastApparition = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!numsFrq.containsKey(nums[i])) {
                numsFrq.put(nums[i], 1);
                firstApparition.put(nums[i], i);
                lastApparition.put(nums[i], i);
            }
            else{
                int actualFr = numsFrq.get(nums[i]);
                numsFrq.put(nums[i], actualFr+1);
            }
            lastApparition.put(nums[i], i);

        }
        int maxFr = 1;
        int minLength = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry: numsFrq.entrySet()) {
            if (maxFr < entry.getValue()) {
                maxFr = entry.getValue();
                minLength = lastApparition.get(entry.getKey()) - firstApparition.get(entry.getKey()) + 1;
            } else if (maxFr == entry.getValue())
                if (lastApparition.get(entry.getKey()) - firstApparition.get(entry.getKey()) + 1 < minLength) {
                    minLength = lastApparition.get(entry.getKey()) - firstApparition.get(entry.getKey()) + 1;
                }
        }
        return minLength;
    }
}


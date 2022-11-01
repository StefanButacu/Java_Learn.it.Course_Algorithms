import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{ {1,3},{2,6},{8,10},{15,18}};
        intervals = merge(intervals);
        for(int i = 0 ; i < intervals.length; i++){
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        merged.add(intervals[0]);
        for(int i = 1 ; i < intervals.length; i++){
            // if can merge in last update
            // else push_back
            int[] last = merged.getLast();
            // (l1, l2)    (i1, i2)
            // l1  i1 l2 i2
            //
            if(intervals[i][0] <= last[1] ){
               merged.getLast()[1] = Math.max(last[1], intervals[i][1]);
            }else merged.add(intervals[i]);
        }

        return merged.toArray(new int[merged.size()][]);

    }
}

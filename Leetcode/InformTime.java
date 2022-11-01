import java.util.*;

public class InformTime {

    public static void main(String[] args) {
        System.out.println(
                numOfMinutes(8, 0,new int[] {-1,0, 1, 1, 1, 3, 3, 5}, new int[]{1, 2, 0, 5, 0 ,1, 0 ,0 }));

    }
    public static int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int max = 0;
        Queue<Integer> Q = new LinkedList<>();
        Q.add(headID);
        Map<Integer, List<Integer>> manages = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            manages.put(i, new ArrayList<>());
        }
        for(int i = 0 ; i < n; i++){
            if(manager[i] != -1)
                manages.get(manager[i]).add(i);
        }

        boolean[] visited = new boolean[n];
        int[] timeToInform = new int[n];
        visited[headID] = true;
        while(!Q.isEmpty()) {
            Integer supervisor = Q.poll();
            List<Integer> personsManaged = manages.get(supervisor);
            for (Integer i : personsManaged) {

                timeToInform[i] = timeToInform[supervisor] + informTime[supervisor];
                max = Math.max(max, timeToInform[i]);
                if (informTime[i] != 0) {
                    Q.add(i);
                }
            }
        }
        return max;
    }
}

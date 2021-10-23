import java.util.*;

public class MinMax {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer > arr = new ArrayList<>();

        for(int i = 0; i< n ; i++){
            int val = sc.nextInt();
            arr.add(val);
        }
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.size() - k + 1; i++){
            Integer min = arr.get(i);
            Integer max = arr.get(i + k-1);
            if( max - min < minUnfairness)
                minUnfairness = max-min;
        }

        System.out.println(minUnfairness);
    }
}

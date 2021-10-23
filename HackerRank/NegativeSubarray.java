import java.util.Arrays;
import java.util.Scanner;

public class NegativeSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        int[] partialSums = new int[n+1];
        for(int i = 0 ; i < n; i++){
            int val = in.nextInt();
            arr[i+1] = val;
        }
        for(int i = 1; i <= n; i++){
            partialSums[i] = partialSums[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(partialSums));
        int negArrs = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if(partialSums[j] - partialSums[i] < 0)
                    negArrs++;
            }
        }
        System.out.println(negArrs);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Hourglass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        Integer maxSum = -55;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                Integer sum = computeSum(arr, i, j);
                if( sum > maxSum)
                    maxSum = sum;
            }

        }

        System.out.println(maxSum);
        bufferedReader.close();
    }
    public static Integer computeSum(List<List<Integer>> arr, int i, int j){
        Integer sum = arr.get(i).get(j);
        int upRow = i - 1;
        int downRow = i + 1;
        int left = j - 1;
        int right = j + 1;
        for(int cursor = left; cursor <= right; cursor++){
            sum += arr.get(upRow).get(cursor);
        }
        for(int cursor = left; cursor <= right; cursor++){
            sum += arr.get(downRow).get(cursor);
        }
        return sum;
    }
}


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solver{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrys = new ArrayList<>();

        int n = in.nextInt();
        for(int i = 0 ; i < n ; i++){
            int d = in.nextInt();
            ArrayList<Integer> currentArr = new ArrayList<>(d);
            for(int j = 0; j < d; j++){
                int value = in.nextInt();
                currentArr.add(value);
            }
            arrys.add(currentArr);
        }
        int queries = in.nextInt();
        for(int i = 0 ; i < queries; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            // x-1 line
            // y-1 col
            try {
                System.out.println(arrys.get(x - 1).get(y - 1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");

            }
        }

    }
}

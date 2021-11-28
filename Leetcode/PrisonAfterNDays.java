import java.util.Arrays;
import java.util.HashSet;

public class PrisonAfterNDays {
    public static void main(String[] args) {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int n = 7;
        System.out.println(Arrays.toString(prisonAfterNDays(cells, n)));
    }

    public static int[] prisonAfterNDays(int[] cells, int n) {
        HashSet<String > seenPatterns = new HashSet<>();
        int cycleCount = 0;
        for(int i = 1 ; i <= n; i++){
            //      System.out.println(Arrays.toString(cells));
            cells = getNextDay(cells);
            String day = Arrays.toString(cells);
            if(!seenPatterns.contains(day)){
                seenPatterns.add(day);
                cycleCount++;
            }
            else
            {
                break;
            }

        }
        n = n%cycleCount;
        for(int i = 1; i <= n; i++){
            cells = getNextDay(cells);
        }
        return cells;
    }
    public static int[] getNextDay(int[] cells){
        int[] copyCells = new int[8];
        for(int i = 1; i < 7; i++){
            if(cells[i-1] == cells[i+1] )
                copyCells[i] = 1;
            else
                copyCells[i] = 0;
        }


        return copyCells;
    }
}

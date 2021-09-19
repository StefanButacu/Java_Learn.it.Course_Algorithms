import java.security.KeyPair;
import java.util.LinkedList;
import java.util.*;

public class FloodFill {

    public static void main(String[] args){
        int[][] img = {{1,1,1}, {1,1,0}, {1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        img= floodFill(img, sr, sc, newColor);
        for(var x: img){

            for(var y: x){

                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        int[] dx = {1,-1, 0, 0};
        int[] dy = {0, 0 , 1, -1};
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<Map.Entry<Integer, Integer>> Q  = new ArrayDeque<Map.Entry<Integer, Integer>>();
        Q.add(Map.entry(sr,sc));
        visited[sr][sc] = true;
        int sourceColor = image[sr][sc];
        while(!Q.isEmpty()){
            Map.Entry<Integer,Integer> current = Q.remove();
            System.out.println("row= " + current.getKey() + "col" + current.getValue());
            int row = current.getKey();
            int col  = current.getValue();
            visited[row][col] = true;
            image[row][col] = newColor;
            for(int i = 0 ; i < 4; i++){
                int newRow = row + dy[i];
                int newCol = col + dx[i];
                // if is in matrix + i didnt went there + has the same color as the source
                // visit it and add it to the Queue and update the image with new color
                if( 0 <= newRow && newRow < m && 0 <= newCol && newCol < n){
                    if(!visited[newRow][newCol]){
                        if(image[newRow][newCol] == sourceColor){
                            image[newRow][newCol] = newColor;
                            Q.add(Map.entry(newRow, newCol));
                        }

                    }

                }

            }
        }
        return image;

    }
}

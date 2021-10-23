import java.util.ArrayDeque;
import java.util.Queue;

public class MaxAreaOfIsland {
    public static void main(String[] arg) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}

        };
        System.out.println(maxAreaOfIsland(grid));
    }

    public static class Pair {
        public int first;
        public int second;

        Pair(int _first, int _second) {
            this.first = _first;
            this.second = _second;
        }

    }

    public static int fill(int[][] grid, int m, int n, int r, int c, boolean[][] isVisited) {
        int nrOfSquares = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        Queue<Pair> Q = new ArrayDeque<>();
        Q.add(new Pair(r, c));
        isVisited[r][c] = true;
        nrOfSquares = 1;
        while (!Q.isEmpty()) {
            Pair currentSq = Q.remove();
            int row = currentSq.first;
            int col = currentSq.second;
            isVisited[row][col] = true;

            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];
                if (0 <= newRow && newRow < m && 0 <= newCol && newCol < n) {
                    if (grid[newRow][newCol] == 1 && !isVisited[newRow][newCol]) {
                        Q.add(new Pair(newRow, newCol));
                        isVisited[newRow][newCol] = true;
                        nrOfSquares++;
                    }

                }
            }

        }

        return nrOfSquares;
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] isVisited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !isVisited[i][j]) {
                    int nrOfSquares = fill(grid, m, n, i, j, isVisited);
                    if (nrOfSquares > maxArea)
                        maxArea = nrOfSquares;
                }

            }
        }

        return maxArea;
    }
}

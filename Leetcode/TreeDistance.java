import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edge = {{0,1}, {0,2}, {2,3}, {2,4}, {2,5}};
		System.out.println(Arrays.toString(sumOfDistancesInTree(6, edge)));
	}

	public static int[] sumOfDistancesInTree(int n, int[][] edges) {
		int[] ans = new int[n];
		int[][] matrix = new int[n][n];
		for (var arr : edges) {
			matrix[arr[0]][arr[1]] = 1;
			matrix[arr[1]][arr[0]] = 1;
		}
		for( var i: matrix) {
			for(var j: i)
				System.out.print(j);
			System.out.println();
			
		}
		for(int i = 0 ; i < n; i++) {
			ans[i] = BFS(n, matrix, i );
			
		}
		
		return ans;
	}
	
	public static int BFS(int n, int[][] matrix, int currentNode) {
		int[] dist = new int[n];
		boolean[] viz = new boolean[n];
		for(int i = 0 ; i < n; i++) {
			dist[i] = 1 << 30 - 1;
			viz[i] = false;
		}
		
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(currentNode);
		viz[currentNode] = true;
		dist[currentNode] = 0;
		while(!Q.isEmpty()) {
			
			currentNode = Q.remove();
		
			for(int i = 0 ; i < matrix[currentNode].length; i++){
				if(matrix[currentNode][i] != 0)
				if(!viz[i])
					{
					dist[i] = 1 + dist[currentNode];
					viz[i] = true;
					Q.add(i);
					}
			}
		}
		
		int sum = 0;
		for(var x: dist)
			sum += x;
		return sum;
	
	}
		
		

}
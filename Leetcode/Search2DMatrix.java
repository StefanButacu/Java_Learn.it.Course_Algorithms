
public class Search2DMatrix {
	public static void main(String[] args) {
	
	//int[][] matrix = {{1,3,4,7}, {10,11,16,20}, {23, 30, 34, 60}};
	int [][] matrix = {{1}};
	System.out.println(searchMatrix(matrix, 0));	
		
	}
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int up = 0;
	        int down = m - 1;
	        while( up <= down && down >= 0) {
	        	int mid = (up + down) / 2;
	        	if(matrix[mid][0] == target)
	        		return true;
	        	if(matrix[mid][0] > target)
	        		down = mid - 1;
	        	else
	        		up = mid + 1;
	        	
	        }
	        if(down < 0)
	        	return false;
	        int left = 0;
	        int right = n - 1;
	        while(left <= right && right >= 0) {
	        	int mid = (left + right) / 2;
	        	if(matrix[down][mid] == target)
	        		return true;
	        	if(matrix[down][mid] > target)
	        		right = mid - 1;
	        	else
	        		left = mid + 1;
	        	
	        }
	        
	        return false;
	    }
}

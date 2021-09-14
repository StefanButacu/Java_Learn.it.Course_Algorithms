import java.util.Arrays;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1,2},
				{3,4},
			
		};
		int [][] ans = matrixReshape(matrix, 2, 2);
		for(int i = 0 ; i < 1; i++) {
			for(int j = 0 ; j < 4; j++)
				System.out.print(ans[i][j]);
			System.out.println();
		}
		
	}
	/*
	 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

 
	 */
	public static int[][] matrixReshape(int[][] mat, int r, int c){
		int m = mat.length;
		int n = mat[0].length;
		if(m * n != r *c)
			return mat;
		int[] linearMatrix = new int[m*n];
		int[][] newMatrix = new int[r][c];

		for(int i = 0 ; i < m;i++) {
			for(int j = 0 ; j < n ;j++) {
				linearMatrix[i * n + j] = mat[i][j];
				
			}
		}
		
		//System.out.println(Arrays.toString(linearMatrix));

		for(int i = 0 ; i < m * n; i++) {
			//System.out.println("[" + i/c + "][" + i % c + "]i="+ i);

			newMatrix[i/c][i%c] = linearMatrix[i];

			
		}
	return newMatrix;	
	}
	

}

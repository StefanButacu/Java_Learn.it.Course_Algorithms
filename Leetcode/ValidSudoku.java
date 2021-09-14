
public class ValidSudoku {

	public static void main(String[] args) {

	}



	public boolean isValidSudoku(char[][] board) {

		int[] nrCounter = new int[10];
		// row verification

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++)
				nrCounter[j] = 0;
			for (int j = 0; j < 10; j++) {
				if (board[i][j] != '.')
					nrCounter[board[i][j] - '0']++;
			}
			for (int j = 0; j < 10; j++) {
				if (nrCounter[j] >= 2)
					return false; // duplicate on the same row
			}

		}
		// column verification
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 10; i++)
				nrCounter[i] = 0;
			for (int i = 0; i < 9; i++) {
				if (board[i][j] != '.')
					nrCounter[board[i][j] - '0']++;
			}
			for (int i = 0; i < 10; i++)
				if (nrCounter[i] >= 2)
					return false; // duplicate on the same column

		}
		for (int left = 0; left < 9; left += 3) {
			for (int right = 0; right < 9; right += 3) {
				for (int i = 0; i < 10; i++)
					nrCounter[i] = 0;
				for (int i = left; i < left + 3; i++) {
					for (int j = right; j < right + 3; j++)
						if (board[i][j] != '.')
							nrCounter[board[i][j] - '0']++;

				}
				for (int i = 0; i < 10; i++)
					if (nrCounter[i] >= 2)
						return false; // duplicate on the same 3x3 square

			}

		}

		return true;

	}
}

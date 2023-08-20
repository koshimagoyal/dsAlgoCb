package lec12;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int row = mat.length;
		int col = mat[0].length;
		int i = 0, j = 0;
		while (j < col) {
			System.out.print(mat[i][j] + " ");
			if (j % 2 == 0) {
				i++;
			} else {
				i--;
			}
			if (i == row - 1 || i == 0) {
				System.out.println(mat[i][j] + " ");
				j++;
			}
		}
	}

}

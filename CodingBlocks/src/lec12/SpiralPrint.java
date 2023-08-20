package lec12;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } };
		int row = mat.length;
		int col = mat[0].length;
		int r = 0,c = 0,i=0,j=0;

		while(true) {
			//left
			while(r<row-i) {
				System.out.print(mat[r][c]+" ");
				r++;
			}
			r--;
			c++;
			//bottom
			while(c<col-j) {
				System.out.print(mat[r][c]+" ");
				c++;
			}
			c--;
			r--;
			//right
			while(r>=i) {
				System.out.print(mat[r][c]+" ");
				r--;
			}
			r++;
			c--;
			j++;
			//top
			while(c>=j) {
				System.out.print(mat[r][c]+" ");
				c--;
			}
			c++;
			r++;
			i++;
			if(i==2) {
				break;
			}
		}

	}

}

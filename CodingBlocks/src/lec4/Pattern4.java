package lec4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; // no of stars
		int row = 1; // number of rows
		while (row <= n) {
			int csp = 0; // count of space
			int nsp = n - row; // no of space in row
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0; // count of stars
			int nst = row; // no of stars in row
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

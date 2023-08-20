package lec5;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; // no of stars
		int row = 1; // number of rows
		int nsp = 0;
		while (row <= n) {
			int csp = 0; // count of space
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0; // count of stars
			int nst = n-row+1; // no of stars in row
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nsp++;
		}
	}

}

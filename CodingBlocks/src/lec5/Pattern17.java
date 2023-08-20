package lec5;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int total_rows = n;
		int nst = n / 2;
		int nsp = 1;
		while (row <= total_rows) {
			// stars
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			// stars
			cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			// preparation
			if (row <= (n / 2) + 1) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			System.out.println();
		}
	}

}

package lec5;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int total_rows = 2 * n - 1;
		int nst = 1;
		while (row <= total_rows) {
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			// preparation
			if (row <= n) {
				nst++;
			} else {
				nst--;
			}
			System.out.println();
		}
	}

}

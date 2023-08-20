package lec5;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int total_rows = n;
		int nst = 1;
		int nsp = n / 2;
		while (row <= total_rows) {
			// spaces
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			// stars
			int cst = 0;
			while (cst < nst) {
				if(cst==0||cst==nst-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}
			row++;
			// preparation
			if (row <= (n / 2) + 1) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}
			System.out.println();
		}
	}

}

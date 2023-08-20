package hw;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		while (row <= n) {
			int cst = 0;
			int nst = n - row + 1;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			int csp = 0;
			int nsp = 2*row - 3;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			if(row==1) {
				cst = 1; 
			} else {
				cst = 0; 
			}
			nst = n - row + 1;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

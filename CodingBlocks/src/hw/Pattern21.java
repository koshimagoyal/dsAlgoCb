package hw;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; 
		int row = 1;
		while(row<=n) {
			int cst = 0; 
			int nst = row; 
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			int csp = 0; 
			int nsp = 2*(n-row)-1; 
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			if(row==n) {
				cst = 1; 
			} else {
				cst = 0; 
			}
			nst = row; 
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

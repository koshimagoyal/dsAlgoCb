package hw;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; 
		int row = 1; 
		while(row<=n) {
			int csp = 0; 
			int nsp = n-row; 
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0; 
			int nst = n-row+1; 
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
		row = 2; 
		while(row<=n) {
			int csp = 0; 
			int nsp = row-1; 
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0; 
			int nst = row; 
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

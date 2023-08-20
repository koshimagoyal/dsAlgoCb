package hw;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while(row<=n) {
			int csp = 0;
			int nsp = row-1;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			int nst = 2*(n-row)+1;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

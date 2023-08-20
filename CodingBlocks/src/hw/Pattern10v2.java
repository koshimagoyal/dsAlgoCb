package hw;

public class Pattern10v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = 2*n-1;
		while(row<=n) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			//preparation for next row
			row++;
			nsp++;
			nst-=2;
			
			System.out.println();
		}
	}

}

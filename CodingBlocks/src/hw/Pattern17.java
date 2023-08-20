package hw;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1,mid=n/2;
		while (row <= n) {
			if(row<=mid+1) {
				//up
				int cst = 0;
				int nst = mid-row+1;
				while (cst < nst) {
					System.out.print("* ");
					cst++;
				}
				int csp = 0;
				int nsp = 2*row - 1;
				while (csp < nsp) {
					System.out.print("  ");
					csp++;
				}
				cst = 0;
				nst = mid-row+1;
				while (cst < nst) {
					System.out.print("* ");
					cst++;
				}
			} else {
				//down
				int cst = 0; 
				int nst = row-mid-1; 
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
				int csp = 0; 
				int nsp = 2*(n-row)+1; 
				while (csp < nsp) {
					System.out.print("  ");
					csp++;
				}
				cst = 0;
				nst = row-mid-1; 
				while (cst < nst) {
					System.out.print("* ");
					cst++;
				}
			}
			System.out.println();
			row++;
		}
	}

}

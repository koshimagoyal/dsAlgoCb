package hw;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1,mid=n/2;
		while (row <= n) {
			if(row<=mid+1) {
				//up
				int cst = 0;
				int nst = mid-row+2;
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
				nst = mid-row+2;
				while (cst < nst) {
					System.out.print("* ");
					cst++;
				}
			} else {
				//down
				int cst = 0; 
				int nst = row-mid; 
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
				nst = row-mid; 
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

package hw;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1,mid=n/2;
		while(row<=n) {
			if(row<=mid+1) {
				int csp = 0;
				int nsp = mid-row+1;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				int cst = 0;
				int nst = 2*row-1;
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
			} else {
				int csp = 0;
				int nsp = row-mid-1;
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
			}
			System.out.println();
			row++;
		}
	}

}

package hw;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1,mid=n/2;
		while(row<=n) {
			if(row<=mid) {
				int csp = 0;
				int nsp = mid-row+1;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
				csp = 0;
				nsp = 2*row-3;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				if(row!=1) {
					System.out.print("* ");
				}
			} else {
				int csp = 0;
				int nsp = row-mid-1;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
				csp = 0;
				nsp = 2*(n-row)-1;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				if(row!=n) {
					System.out.print("* ");
				}
			}
			System.out.println();
			row++;
		}
	}

}

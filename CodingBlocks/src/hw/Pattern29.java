package hw;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while(row<=n) {
			int csp = 0;
			int nsp = n-row;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int count = row;
			System.out.print(count+" ");
			csp = 1;
			nsp = 2*row-2;
			while(csp<nsp) {
				System.out.print("0 ");
				csp++;
			}
			if(row!=1) {
				System.out.print(count+" ");
			}
			System.out.println();
			row++;
		}
	}

}

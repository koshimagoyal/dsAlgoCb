package hw;

public class Pattern27 {

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
			int cst = 0;
			int nst = 2*row-1;
			int count = 1;
			while(cst<nst) {
				System.out.print(count+" ");
				if(cst<row-1) {
					count++;
				} else {
					count--;
				}
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

package hw;

public class Pattern12 {

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
			int nst = row;
			while(cst<nst) {
				System.out.print("* ");
				if(cst+1<nst) {
					System.out.print("! ");
				}
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

package lec5;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nsp = 2*n-3;
		int nst1 = 1;
		int nst2 = 1;
		while (row <= n) {
			//star 1
			int cst1=0;
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			//space
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			//star 2
			int cst2=0;
			if(row==n) {
				cst2++;
			}
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			row++;
			nst1++;
			nst2++;
			nsp-=2;
			System.out.println();
		}
	}

}

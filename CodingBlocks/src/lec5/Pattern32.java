package lec5;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int total_rows = 2 * n - 1;
		int nst = 1;
		int ntp = 1;
		while (row <= total_rows) {
			int cst = 0;
			while (cst < nst) {
				if(cst%2==0) {
					System.out.print(ntp+" ");
				} else {
					System.out.print("* ");
				}
				cst++;
			}
			row++;
			// preparation
			if (row <= n) {
				nst+=2;
				ntp++;
			} else {
				nst-=2;
				ntp--;
			}
			System.out.println();
		}
	}

}

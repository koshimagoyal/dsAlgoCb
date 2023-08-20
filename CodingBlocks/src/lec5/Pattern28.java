package lec5;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		while(row<=n) {
			int ntp = row;
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				System.out.print(ntp+" ");
				cst++;
				if(cst+csp<n) {
					ntp++;
				} else {
					ntp--;
				}
			}
			//mera row ke liye kaam khtm
			
			//preparation for next row
			row++;
			nsp--;
			nst+=2;
			
			System.out.println();
		}
	}

}

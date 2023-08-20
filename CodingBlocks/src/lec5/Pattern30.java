package lec5;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		while(row<=n) {
			int ntp = n;
			int cst = 0;
			while(cst<nst) {
				System.out.print(ntp+" ");
				cst++;
				ntp--;
			}
			//mera row ke liye kaam khtm
			
			//preparation for next row
			row++;
			
			System.out.println();
		}
	}

}

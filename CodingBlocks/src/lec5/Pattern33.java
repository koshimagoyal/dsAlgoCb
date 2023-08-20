package lec5;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		while(row<=n) {
			int ntp = n-row+1;
			int csp = 0;
			while(csp<nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				if(ntp==10) {
					System.out.print("0\t");
				} else {
					System.out.print(ntp+"\t");
				}
				cst++;
				if(cst+csp<n) {
					ntp++;
				} else {
					ntp--;
				}
			}
			
			//preparation for next row
			row++;
			nsp--;
			nst+=2;
			
			System.out.println();
		}
	}

}

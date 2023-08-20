package lec5;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		while(row<=n) {
			int ntp = n;
			int cst = 0;
			while(cst<nst) {
				if(cst==n-row) {
					System.out.print("* ");
				} else {
					System.out.print(ntp+" ");
				}
				cst++;
				ntp--;
			}
			
			//preparation for next row
			row++;
			
			System.out.println();
		}
	}

}

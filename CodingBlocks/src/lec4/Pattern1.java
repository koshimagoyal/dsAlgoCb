package lec4;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; //no of stars
		int row = 1; //number of rows
		int nst = n; //no of stars in row
		while(row<=n) {
			int  cst = 0; //count of stars
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

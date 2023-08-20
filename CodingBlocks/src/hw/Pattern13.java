package hw;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; 
		int row = 1; 
		while(row<=n) {
			int cst = 0; 
			int nst = row; 
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
		row = 2;
		while(row<=n) {
			int cst = 0; 
			int nst = n-row+1; 
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

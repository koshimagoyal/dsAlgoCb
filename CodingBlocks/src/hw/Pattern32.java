package hw;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
		int row = 1; 
		while(row<=n) {
			int cst = 0; 
			int nst = row; 
			int count = row;
			while(cst<nst) {
				System.out.print(count+" ");
				if(cst<nst-1) {
					System.out.print("* ");
				}
				cst++;
			}
			System.out.println();
			row++;
		}
		row = 2;
		while(row<=n) {
			int cst = 0; 
			int nst = n-row+1; 
			int count = n-row+1;
			while(cst<nst) {
				System.out.print(count+" ");
				if(cst<nst-1) {
					System.out.print("* ");
				}
				count--;
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}

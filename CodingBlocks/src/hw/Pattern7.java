package hw;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while(row<=n) {
			if(row==1||row==n) {
				int cst = 0;
				while(cst<n) {
					System.out.print("* ");
					cst++;
				}
			} else {
				System.out.print("* ");
				int csp = 1;
				while(csp<n-1) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}
	}

}

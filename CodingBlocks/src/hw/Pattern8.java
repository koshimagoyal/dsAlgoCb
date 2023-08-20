package hw;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		while(row<=n) {
			int col = 1;
			while(col<=n) {
				if(row==col) {
					System.out.print("* ");
				} else if(row+col==n+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}

}

package hw;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while(row<=n) {
			int count = n,col=1;
			while(col<=n) {
				if(row+col==n+1) {
					System.out.print("* ");
				} else {
					System.out.print(count+" ");
				}
				count--;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}

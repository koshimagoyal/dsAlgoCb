package hw;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		while(row<=n) {
			int count = n;
			while(count>=1) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
			row++;
		}
	}

}

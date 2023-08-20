package lec18;

public class PrintIncreasingDecreasing {

	public static void main(String[] args) {
		pi(3);
		pd(3);
	}
	
	public static void pi(int n) {
		if(n==0)
			return;
		pi(n-1);
		System.out.println(n);
	}
	
	public static void pd(int n) {
		if(n==0)
			return;
		System.out.println(n);
		pd(n-1);
	}

}

package lec8;

public class Swap_global {

	static int a = 5;
	static int b = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a:"+a+" b:"+b);
		swap();
		System.out.println("a:"+a+" b:"+b);
	}
	
	public static void swap() {
		System.out.println("----In swap");
		System.out.println("a:"+a+" b:"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+" b:"+b);
		System.out.println("----Out swap");
	}

}

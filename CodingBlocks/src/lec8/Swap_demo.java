package lec8;

public class Swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		System.out.println("a:"+a+" b:"+b);
		swap(a,b);
		System.out.println("a:"+a+" b:"+b);
	}
	
	public static void swap(int a,int b) {
		System.out.println("----In swap");
		System.out.println("a:"+a+" b:"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+" b:"+b);
		System.out.println("----Out swap");
	}

}

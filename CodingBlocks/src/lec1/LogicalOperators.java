package lec1;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		System.out.println(!(x==5));
		
		int a = 5;
		int b = 10;
		System.out.println((a==5)&&(a>b));
		System.out.println((a==5)&&(a<b));
		

		System.out.println((a==5)||(a>b));
		System.out.println((a==5)||(a<b));
		System.out.println((a!=5)||(a<b));
		

		System.out.println(!(a==5));
		System.out.println(!(a==10));

	}

}

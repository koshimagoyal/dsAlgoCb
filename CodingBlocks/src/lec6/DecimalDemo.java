package lec6;

import java.util.Scanner;

public class DecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = (float)10.8;
		float f1 = 10.8f;
		System.out.println(f+","+f1);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println("---------");
		
		double d = 256.4949;
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		int i = 10;
		f = i;
		System.out.println(f);
		
		int i2 = (int)f;
		System.out.println(i2);
		
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		System.out.println(d1);
		float f2 = sc.nextFloat();
		System.out.println(f2);
		sc.close();
	}

}

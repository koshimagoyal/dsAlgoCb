package lec1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int si = (p*r*t)/100;
		System.out.println("Simple Interest = "+si);
		sc.close();
	}

}

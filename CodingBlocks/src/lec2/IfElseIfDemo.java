package lec2;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = n%5;
		if(rem==0 && n>50) {
			System.out.println("Multiple of 5");
		} else if(rem==1) {
			System.out.println("Not a multiple");
		} else {
			System.out.println("Abbey jaa naa!!");
		}
		sc.close();
	}

}

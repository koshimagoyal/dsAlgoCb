package lec4;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int count = 1; //n1 kitne process kr chuka h
		while(count<=n) {
			int nn = n1+n2;
			n1 = n2;
			n2 = nn;
			count++;
		}
		System.out.println(n1);
		sc.close();
	}

}

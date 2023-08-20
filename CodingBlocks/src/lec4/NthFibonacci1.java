package lec4;

import java.util.Scanner;

public class NthFibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int count = 0; //which fibonacci is stored in n1
		while(count<n) {
			int nn = n1+n2;
			n1 = n2;
			n2 = nn;
			count++;
		}
		System.out.println(n1);
		sc.close();
	}

}

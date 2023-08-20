package lec2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=1,factors=0;
		while(count<=n) {
			if(n%count==0) {
				factors++;
			}
			count++;
		}
		if(factors==2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}

}

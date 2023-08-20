package lec3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 2;
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		while(count!=n) {
			int temp = first+second;
			System.out.println(temp);
			second = first;
			first = temp;
			count++;
		}
		sc.close();
	}

}

package lec2;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=1,sum=0;
		while(count<=n) {
			sum+=count;
			count++;
		}
		System.out.println("sum = "+sum);
		sc.close();
	}

}

package lec2;

import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=1;
		while(count<=n) {
			System.out.println(count);
			count++;
		}
		sc.close();
	}

}

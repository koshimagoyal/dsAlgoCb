package lec7;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		
		String str1 = sc.nextLine();
		System.out.println(str1);
		sc.close();
	}

}

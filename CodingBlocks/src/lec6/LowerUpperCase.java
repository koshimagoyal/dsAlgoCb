package lec6;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("Lowercase");
		} else if(ch>='A'&&ch<='Z') {
			System.out.println("Uppercase");
		} else {
			System.out.println("Other than alphabet");
		}
		
		scn.close();
	}

}

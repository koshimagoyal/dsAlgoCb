package lec6;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		char ch = scn.next().charAt(0);
		System.out.println(ch);
		
		char c = 'a';
		System.out.println(c);
		
		System.out.println((int)c);
		System.out.println(ch+1);
		System.out.println((char)(ch+1));
		System.out.println((char)100);
		scn.close();
	}

}

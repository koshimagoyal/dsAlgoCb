package lec15;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());
		// reverse whole string
		reverse(str, 0, str.length() - 1);
		// reverse words
		int idx = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				reverse(str, idx, i - 1);
				idx = i + 1;
			}
		}
		System.out.println(str);
		sc.close();
	}

	public static void reverse(StringBuilder sb, int l, int r) {
		while (l <= r) {
			char temp = sb.charAt(l);
			sb.setCharAt(l, sb.charAt(r));
			sb.setCharAt(r, temp);
			l++;
			r--;
		}
	}

}

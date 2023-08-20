package lec3;

import java.util.Scanner;

public class OptPrime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=2,factors=0;
		while(count<n) {
			if(n%count==0) {
				factors++;
			}
			count++;
		}
		if(n<2){
			System.out.println("Concept of Prime not for "+n);
		} else if(factors==0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}

}

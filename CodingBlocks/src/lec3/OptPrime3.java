package lec3;

import java.util.Scanner;

public class OptPrime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=2;
		boolean flag = false;
		while(count*count<=n) {
			if(n%count==0) {
				flag = true;
				break;
			}
			count++;
		}
		if(n<2){
			System.out.println("Concept of Prime not for "+n);
		} else if(!flag) {
			//or check if (i==n)
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}

}

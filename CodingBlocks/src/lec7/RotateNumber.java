package lec7;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int countOfDigits = 0,temp = n,ans=0;
		while(temp>0) {
			countOfDigits++;
			temp/=10;
		}
		if(r>countOfDigits) {
			r=r-countOfDigits; //using - will take more rotations
		}
		temp = n;
		int rem = temp%(int)Math.pow(10, r);
		temp/=(int)Math.pow(10, r);
		n = temp;
		int countOfRemainingDigits = 0;
		while(temp>0) {
			temp/=10;
			countOfRemainingDigits++;
		}
		ans = ans+rem*(int)Math.pow(10,countOfRemainingDigits);
		ans+=n;
		System.out.println(ans);
		sc.close();
	}

}

package lec8;

public class PrintAllArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArmstrongNumbers(1000);
	}
	
	private static void printArmstrongNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isArmstrong(int num) {
		int nod = numberOfDigits(num);
		int temp = num,sum=0;
		while(temp>0) {
			int rem = temp%10;
			sum += (int)Math.pow(rem, nod);
			temp /= 10;
		}
		if(sum==num) {
			return true;
		}
		return false;
	}
	
	private static int numberOfDigits(int num) {
		int count = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}

}

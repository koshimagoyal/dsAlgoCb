package lec7;

public class RotateNumberModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rot = 100007;
		int nod = 0;
		int backup = num;
		while (num != 0) {
			num /= 10;
			nod++;
		}
		num = backup;
		rot = rot%nod;
		int r = 0;
		while (r < rot) {
			// Rotation Logic
			int last = num % 10;
			int remNum = num / 10;
			int rotatedNumber = last * (int) Math.pow(10, nod - 1) + remNum;
			System.out.println((r+1)+" "+rotatedNumber);
			num = rotatedNumber;
			r++;
		}
		System.out.println(num);
	}

}

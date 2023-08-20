package lec7;

public class RotateNumberOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rot = 100009;
		int nod = 0;
		int backup = num;
		while (num != 0) {
			num /= 10;
			nod++;
		}
		num = backup;
		rot = rot % nod;
		// Rotation Logic
		int part1 = num / (int)Math.pow(10, rot);
		int part2 = num % (int)Math.pow(10, rot);
		
		//part2 ko aage khiskana
		int rotatedNumber = part2 * (int) Math.pow(10, nod-rot) + part1;
		//System.out.println((rot + 1) + " " + rotatedNumber);
		System.out.println(rotatedNumber);
	}

}

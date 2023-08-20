package lec7;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 0;
		int decimal = 14;
		int mult = 1;

		// find remainder
		while (decimal > 0) {
			int rem = decimal % 2;
			// multiply with increasing power of 2
			bin += rem * mult;
			mult *= 10;
			decimal /= 2;
		}

		System.out.println(bin);
	}

}

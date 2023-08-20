package lec7;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oct = 0;
		int decimal = 18;
		int mult = 1;

		// find remainder
		while (decimal > 0) {
			int rem = decimal % 8;
			// multiply with increasing power of 2
			oct += rem * mult;
			mult *= 10;
			decimal /= 8;
		}

		System.out.println(oct);
	}

}

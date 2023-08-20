package lec7;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oct = 22;
		int decimal = 0;
		int mult = 1;

		// find remainder
		while (oct > 0) {
			int rem = oct % 10;
			// multiply with increasing power of 2
			decimal = decimal + rem * mult;
			mult *= 8;
			oct /= 10;
		}

		System.out.println(decimal);
	}

}

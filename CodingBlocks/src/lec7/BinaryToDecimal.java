package lec7;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 101101110;
		int decimal = 0;
		int mult = 1;

		// find remainder
		while (bin > 0) {
			int rem = bin % 10;
			// multiply with increasing power of 2
			decimal = decimal + rem * mult;
			mult *= 2;
			bin /= 10;
		}

		System.out.println(decimal);

	}

}

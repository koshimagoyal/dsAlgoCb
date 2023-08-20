package lec15;

import java.util.ArrayList;

public class Add2Arrays {

	public static void main(String[] args) {
		int[] arr1 = { 5, 6, 8, 1 };
		int[] arr2 = { 2, 7, 3 };

		ArrayList<Integer> res = add(arr1, arr2);
		System.out.println(res);
	}

//	public static ArrayList<Integer> add(int arr1[], int arr2[]) {
//		ArrayList<Integer> res = new ArrayList<>();
//		int i = arr1.length - 1, j = arr2.length - 1;
//		int carry = 0;
//		while (i >= 0 && j >= 0) {
//			int sum = arr1[i] + arr2[j] + carry;
//			if (sum > 9) {
//				res.add(0,sum % 10);
//				carry = sum / 10;
//			} else {
//				res.add(0,sum);
//				carry = 0;
//			}
//			i--;
//			j--;
//		}
//		while(i>=0) {
//			res.add(0,arr1[i]+carry);
//			i--;
//		}
//		while(j>=0) {
//			res.add(0,arr2[j]+carry);
//		}
//		return res;
//	}

	public static ArrayList<Integer> add(int arr1[], int arr2[]) {
		ArrayList<Integer> res = new ArrayList<>();
		int i = arr1.length - 1, j = arr2.length - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int d1 = (i < 0) ? 0 : arr1[i];
			int d2 = (j < 0) ? 0 : arr2[j];
			int sum = d1 + d2 + carry;
			res.add(0, sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		if(carry!=0) {
			res.add(0, carry);
		}
		return res;
	}

}

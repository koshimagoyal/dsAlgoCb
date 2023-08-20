package lec9;

import java.util.Scanner;

public class Array_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		display(arr);

		int max = max(arr);
		System.out.println("Max element is: " + max);

		int idx = find(arr, 200);
		System.out.println("Element found at: " + idx);

		reverse(arr);
		System.out.println("Reverse");
		display(arr);

		rotateWithLoop(arr,106);
		System.out.println("RotateWithLoop");
		display(arr);
		
		rotateWithOutLoop(arr,107);
		System.out.println("RotateWithOutLoop");
		display(arr);
		
		int[] invArr = inverseWithTemp(arr);
		System.out.println("InverseWithTemp");
		display(invArr);
		
		inverseWithOutTemp(arr);
		System.out.println("InverseWithOutTemp");
		display(arr);
		
	}

	public static void reverse(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotateWithLoop(int[] arr,int nor) {
		nor = nor%arr.length;
		for(int i=0;i<nor;i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0]=temp;
		}
	}

	public static void rotateWithOutLoop(int[] arr,int nor) {
		nor = nor%arr.length;
		int temp[] = new int[nor];
		//store elements to be rotated
		for(int i=0;i<nor;i++) {
			temp[i] = arr[arr.length-nor+i];
		}
		//move array to right
		for(int i=arr.length-1;i>=nor;i--) {
			arr[i] = arr[i-nor];
		}
		//store temp values in array
		for(int i=0;i<nor;i++) {
			arr[i] = temp[i];
		}
	}
	
	public static int[] inverseWithTemp(int[] arr) {
		int newArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[arr[i]] = i;
		}
		return newArr;
	}
	
	public static void inverseWithOutTemp(int[] arr) {
		int position = 0;
		int prevDigit;
		int newDigit = arr[position];
		for(int i=0;i<arr.length;i++) {
			prevDigit = position;
			position = newDigit;
			newDigit = arr[position];
			arr[position] = prevDigit;
		}
	}

	// find index of element in an array
	private static int find(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		// if not found return -1
		return -1;
	}

	private static int max(int[] arr) {
		int max = Integer.MIN_VALUE; // good practice
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = scn.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		return arr;
	}

	private static void display(int[] arr) {
		System.out.println("-------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-------");
	}

}

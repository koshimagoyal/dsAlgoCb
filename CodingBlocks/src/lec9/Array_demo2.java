package lec9;

public class Array_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80};
		arr2 = arr1;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println("-------");
		arr1[0] = 100;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
	}

}

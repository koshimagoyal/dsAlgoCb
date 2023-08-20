package lec9;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		arr[2] = 10;
		arr[0] = 5;
		arr[1] = 20;
		
		System.out.println(arr[2]);
		System.out.println(arr[0]);
		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		System.out.println(arr);
		
		int size = arr.length;
		System.out.println(size);
		
		//enhanced for loop
		for(int a:arr) {
			System.out.println(a+" ");
		}
	}

}

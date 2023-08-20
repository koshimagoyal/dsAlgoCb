package lec9;

public class SwapTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80};
		System.out.println("a:"+arr1[0]+" b:"+arr2[0]);
		//swap(arr1[0],arr2[0]); nahi chalegi
		swap(arr1,arr2);
		/*
		 * Local changes will not reflect here
		 */
		System.out.println("a:"+arr1[0]+" b:"+arr2[0]);
	}
	
	public static void swap(int[] a1,int a2[]) {
		System.out.println("In Swap");
		System.out.println("a:"+a1[0]+" b:"+a2[0]);
		int[] d = a1;
		a1 = a2;
		a2 = d;
		System.out.println("a:"+a1[0]+" b:"+a2[0]);
		System.out.println("Out Swap");
	}

}

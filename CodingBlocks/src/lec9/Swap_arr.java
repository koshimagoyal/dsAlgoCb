package lec9;

public class Swap_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80};
		System.out.println("a:"+arr1[0]+" b:"+arr2[0]);
		//swap(arr1[0],arr2[0]); nahi chalegi
		swap1(arr1,arr2,0);
		System.out.println("a:"+arr1[0]+" b:"+arr2[0]);
	}
	
	public static void swap1(int[] a1,int a2[], int i) {
		System.out.println("In Swap");
		System.out.println("a:"+a1[0]+" b:"+a2[0]);
		int d = a1[i];
		a1[i] = a2[i];
		a2[i] = d;
		System.out.println("a:"+a1[0]+" b:"+a2[0]);
		System.out.println("Out Swap");
	}
	
	public static void swap(int a,int b) {
		System.out.println("----In swap");
		System.out.println("a:"+a+" b:"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+" b:"+b);
		System.out.println("----Out swap");
	}

}

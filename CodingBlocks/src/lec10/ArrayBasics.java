package lec10;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		display(arr);

		reverse(arr);
		System.out.println("Reverse");
		display(arr);

		arr = reverse2(arr);
		System.out.println("Reverse2");
		display(arr);

		rotate(arr, 3);
		System.out.println("Rotate");
		display(arr);
		
		rotate2(arr,2);
		System.out.println("Rotate2");
		display(arr);

	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		}
	}
	
	public static void rotate2(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot==0)
			return;
		reverse3(arr,0,arr.length-1);
		reverse3(arr,0,rot-1);
		reverse3(arr,rot,arr.length-1);
	}
	
	public static void reverse3(int[] arr, int l,int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	public static void reverse(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

	public static int[] reverse2(int[] arr) {
		int[] reversed_array = new int[arr.length];
		int l = 0, r = arr.length - 1;
		while (l < arr.length) {
			reversed_array[r] = arr[l];
			l++;
			r--;
		}
		return reversed_array;
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

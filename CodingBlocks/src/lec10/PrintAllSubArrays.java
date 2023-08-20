package lec10;

public class PrintAllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		printAllSubarrays(arr);
		System.out.println("Sum-->"+maximumSumSubarray(arr));
		System.out.println("Sum-->"+maximumSumSubarray2(arr));
	}

	public static void printAllSubarrays(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]+" ");
					sum+=arr[i];
				}
				System.out.println("Sum : "+sum);
			}
		}
	}
	
	public static int maximumSumSubarray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]+" ");
					sum+=arr[i];
				}
				max = Math.max(max, sum);
				System.out.println("Sum : "+sum);
			}
		}
		return max;
	}
	
	public static int maximumSumSubarray2(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
				sum+=arr[e];
			}
			max = Math.max(max, sum);
		}
		return max;
	}

}

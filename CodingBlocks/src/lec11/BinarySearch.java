package lec11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, -40, 50 };
		int ele = 50;
		System.out.println("Sum-->"+binarySearch(arr,ele));
	}
	
	public static int binarySearch(int[] arr,int ele) {
		int l = 0;
		int r = arr.length;
		int mid = (l+r)/2;
		while(l<=r) {
			if(arr[mid]==ele) {
				return mid;
			} else if(arr[mid]<ele) {
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		return -1;
	}

}

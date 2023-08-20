package lec15;

import java.util.ArrayList;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] arr1 = {5,10,10,15,25,28,30,35};
		int[] arr2 = {2,3,10,10,10,20,25,35,40};
		ArrayList<Integer> res = intersect(arr1,arr2);
		System.out.println(res);
	}
	
	public static ArrayList<Integer> intersect1(int[] arr1, int[] arr2) {
		ArrayList<Integer> res = new ArrayList<>();
		int low = 0;
		for(int i=0;i<arr1.length;i++) {
			int pos = found(arr2, low, arr1[i]);
//			System.out.println(arr1[i]+" "+low+" "+pos);
			if(pos!=-1) {
				res.add(arr1[i]);
				low = pos - 1;
			} else {
				low = 0;
			}
		}
		return res;
	}
	
	public static ArrayList<Integer> intersect(int[] arr1, int[] arr2) {
		ArrayList<Integer> res = new ArrayList<>();
//		int n = Math.min(arr1.length, arr2.length);
		int i = 0, j = 0;
		while(i<arr1.length&&j<arr2.length) {
//			System.out.println(i+" "+j+" "+arr1[i]+" "+arr2[j]);
			if(arr2[j]<arr1[i]) {
				j++;
			} else if(arr2[j]>arr1[i]) {
				i++;
			} else {
				res.add(arr1[i]);
				i++;
				j++;
			}
		}
		return res;
	}
	
	public static int found(int arr[], int low, int ele) {
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==ele)
				return mid;
			else if(arr[mid]>ele) 
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

}

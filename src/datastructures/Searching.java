package datastructures;

public class Searching {
	public static void main(String[] args) {
		int[] a = {1, 4, 7, 9, 13, 17, 19, 27, 29};
		System.out.println(binarySearch(a, 29, 0, a.length-1));
	}
	
	public static int binarySearch(int[] arr, int target, int left, int right) {
		int mid = (left + right)/2;
		
		if(arr[mid] == target) {
			return mid;
		} 
		
		if (right == left) {
			return -1;
		}
		
		if(arr[mid] > target) {
			return binarySearch(arr, target, left, mid-1);
		}
		
		return binarySearch(arr, target, mid+1, right);	
	}
}

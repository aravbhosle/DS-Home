package datastructures;
import java.util.Arrays;

public class Sorting {
	public static void main (String[] args) {
		int[] a = {1, 4, 4, 4};
		int[] b = {2, 4, 6, 8};
		int[] c = {1, 7, 4, 2, 4, 9};
		System.out.println(Arrays.toString(merge(a, b)));
		System.out.println(Arrays.toString(c));
	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] mergedArr = new int[a.length + b.length];
		int aCount = 0;
		int bCount = 0;
		int mCount = 0;
		
		while(aCount<a.length && bCount<b.length) {
			if(a[aCount] > b[bCount]) {
				mergedArr[mCount++] = b[bCount++];
			} else {
				mergedArr[mCount++] = a[aCount++];
			}
		}
		
		while(aCount<a.length) {
			mergedArr[mCount++] = a[aCount++];
		}
		
		while(bCount<b.length) {
			mergedArr[mCount++] = b[bCount++];
		}
			
		return mergedArr;
	}
	
	public static int[] bubbleSort(int[] a) {
		for(int i = 1; i< a.length; i++) {
			for(int j = 0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		return a;
	}
}

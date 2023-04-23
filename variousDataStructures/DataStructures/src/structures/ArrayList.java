package structures;

import java.util.Arrays;

public class ArrayList {
	private int[] arr;
	
	public ArrayList() {
		arr = new int[0];
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}
	public void add(int num, int pos) {
		int[] temp = new int[arr.length+1];
		
		for(int i = 0; i<pos; i++) {
			temp[i] = arr[i];
		}
		temp[pos] = num;
		for(int i = pos; i<arr.length; i++) {
			temp[i+1] = arr[i];
		}
		
		arr = temp;
	}
	public void add(int num) {
		int[] temp = new int[arr.length+1];
		
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length-1] = num;
		arr = temp;
	}
	
	public void remove(int index) {
		int[] temp = new int[arr.length-1];
		for(int i = 0; i<index; i++) {
			temp[i] = arr[i];
		}
		for(int i = index+1; i<arr.length; i++) {
			temp[i-1] = arr[i]; 
		}
		
		arr = temp;
	}
	
	public int getSize() {
		return arr.length;
	}
}

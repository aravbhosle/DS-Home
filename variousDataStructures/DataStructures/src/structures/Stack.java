package structures;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> stack;
	
	public Stack() {
		this.stack = new ArrayList<Integer>();
	}
	
	public void add(int x) {
		stack.add(x);
	}
	
	public int pop() {
		return stack.remove(stack.size()-1);	
	}
	
	public int getSize() {
		return stack.size();
	}
}

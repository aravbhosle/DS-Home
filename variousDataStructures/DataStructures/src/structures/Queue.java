package structures;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer> queue;
	
	public Queue() {
		this.queue = new ArrayList<Integer>();
	}
	
	public void add(int x) {
		queue.add(x);
	}
	
	public int pop() {
		return queue.remove(0);	
	}
	
	public int getSize() {
		return queue.size();
	}
}

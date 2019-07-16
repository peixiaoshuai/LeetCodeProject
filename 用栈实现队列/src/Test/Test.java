package Test;

import 解题方法.MyQueue;

public class Test {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		
		System.err.println(queue.peek());
		
		queue.pop();
		System.err.println(queue.peek());
		
		System.err.println(queue.empty());
	}
}

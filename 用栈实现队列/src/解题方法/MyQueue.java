package 解题方法;

import java.util.Stack;

/**
 * 一个队列是 FIFO 的，但一个栈是 LIFO 的。这就意味着最新压入的元素必须得放在栈底。
 * 为了实现这个目的，我们首先需要把 s1 中所有的元素移到 s2 中，接着把新元素压入 s2。最后把 s2 中所有的元素弹出，再把弹出的元素压入 s1
 * @author Simon.Hoo
 *
 */
public class MyQueue {
	private int front;

	private Stack<Integer> aStack;
	
	private Stack<Integer> bStack;
	public MyQueue() {
		aStack = new Stack<Integer>();
		bStack = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		if(aStack.isEmpty()){
			front = x;
		}
		while(!aStack.isEmpty()){
			bStack.push(aStack.pop());
		}
		aStack.push(x);
		while(!bStack.isEmpty()){
			aStack.push(bStack.pop());
		}
		front = aStack.peek();
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return aStack.pop();
	}

	/** Get the front element. */
	public int peek() {
		return aStack.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return aStack.isEmpty();
	}
}

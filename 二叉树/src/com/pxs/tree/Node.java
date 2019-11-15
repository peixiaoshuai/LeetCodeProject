package com.pxs.tree;

public class Node {
	int date;//节点数据

	Node leftChild;//左子节点的引用

	Node rightChild;//右子节点的引用

	boolean isDelete;//表示节点是否被删除

	public Node(int date) {
		this.date = date;
	}
	public void display() {
		System.out.println(date);
	}
}

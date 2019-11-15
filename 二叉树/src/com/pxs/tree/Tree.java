package com.pxs.tree;

/**
 * 二叉树：树的每个节点最多只能有两个子节点
 * 上图的第一幅图B节点有DEF三个子节点，就不是二叉树，称为多路树；而第二幅图每个节点最多只有两个节点，是二叉树，
 * 并且二叉树的子节点称为“左子节点”和“右子节点”。
 * 如果我们给二叉树加一个额外的条件，就可以得到一种被称作二叉搜索树(binary search tree)的特殊二叉树。
 * 二叉搜索树要求：
 * 	若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
 * 	若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
 *  它的左、右子树也分别为二叉排序树。
 * @author pxs
 *
 */
public interface Tree {
	//查找节点
	public Node find(int key);
	//插入节点
	public boolean insert(int key);
	//删除节点
	public boolean delete(int key);
}

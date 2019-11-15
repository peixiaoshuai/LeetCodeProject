package com.pxs.tree;

public class BinaryTree implements Tree{
	//标示根节点
	private Node root;
	
	/**
	 * 查找某个节点，我们必须从根节点开始遍历。
	 * ①、查找值比当前节点值大，则搜索右子树；
	 * ②、查找值等于当前节点值，停止搜索（终止条件）；
	 * ③、查找值小于当前节点值，则搜索左子树；
	 * 
	 * 用变量current来保存当前查找的节点，参数key是要查找的值，刚开始查找将根节点赋值到current。
	 * 接在在while循环中，将要查找的值和current保存的节点进行对比。
	 * 如果key小于当前节点，则搜索当前节点的左子节点，如果大于，则搜索右子节点，
	 * 如果等于，则直接返回节点信息。当整个树遍历完全，即current == null，那么说明没找到查找值，返回null。
	 * 
	 * 
	 * 树的效率：查找节点的时间取决于这个节点所在的层数，每一层最多有2n-1个节点，总共N层共有2n-1个节点，那么时间复杂度为O(logN),底数为2。
	 */
	@Override
	public Node find(int key) {
		Node current = root;
		while(current != null){
			if(current.date < key){
				current = current.rightChild;
			}else if(current.date > key){
				current = current.leftChild;
			}else{
				return current;
			}
		}
		return null;
	}
	/**
	 *  要插入节点，必须先找到插入的位置。
	 *  与查找操作相似，由于二叉搜索树的特殊性，待插入的节点也需要从根节点开始进行比较，小于根节点则与根节点左子树比较，
	 *  反之则与右子树比较，直到左子树为空或右子树为空，则插入到相应为空的位置，
	 *  在比较的过程中要注意保存父节点的信息 及 待插入的位置是父节点的左子树还是右子树，才能插入到正确的位置。
	 */
	@Override
	public boolean insert(int key) {
		Node newNode = new Node(key);
		if(root == null){
			root = newNode;
			return true;
		}else{
			Node current = root;
			
			Node parentNode = null;
			
			while(current != null){
				parentNode = current;
				
				if(current.date > key){//当前值比插入值大，搜索左子节点
					current = current.leftChild;
					if(current == null){//左子节点为空，直接将新值插入到该节点
						parentNode.leftChild = newNode;
						return true;
					}
				}else{
					current = current.rightChild;
					if(current == null){//左子节点为空，直接将新值插入到该节点
						parentNode.rightChild = newNode;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(int key) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 遍历树
	 * 遍历树是根据一种特定的顺序访问树的每一个节点。比较常用的有前序遍历，中序遍历和后序遍历。而二叉搜索树最常用的是中序遍历。
	 * ①、中序遍历:左子树——》根节点——》右子树
	 * ②、前序遍历:根节点——》左子树——》右子树
	 * ③、后序遍历:左子树——》右子树——》根节点
	 * 
	 */
	//中序遍历
	public void infixOrder(Node current) {
		if(current != null){
			infixOrder(current.leftChild);
			System.err.println(current.date);
			infixOrder(current.rightChild);
		}
	}
	//前序遍历
	public void preOrder(Node current) {
		if(current != null){
			System.err.println(current.date);
			infixOrder(current.leftChild);
			infixOrder(current.rightChild);
		}
	}
	//后续遍历
	public void postOrder(Node current) {
		if(current != null){
			infixOrder(current.leftChild);
			infixOrder(current.rightChild);
			System.err.println(current.date);
		}
	}

}

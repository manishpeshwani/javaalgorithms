package javaalgorithms;

public class TreeNode<T> {
	private int value;
	private TreeNode<T> leftNode;
	private TreeNode<T> rightNode;
	
	public TreeNode(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode<T> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode<T> getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	
}

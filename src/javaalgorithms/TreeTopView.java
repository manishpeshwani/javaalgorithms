package javaalgorithms;

public class TreeTopView {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3); 
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		
		root.setLeftNode(node5);
		root.setRightNode(node2);
		
		node5.setLeftNode(node1);
		node5.setRightNode(node4);
		
		node2.setLeftNode(node6);
		node2.setRightNode(node7);
		
		node1.setLeftNode(node9);
		
		node7.setLeftNode(node8);
		
		topView(root);
		
	}
	
	public static void topView(TreeNode root){
		if(root == null){
			return;
		}
		leftTopView(root.getLeftNode());
		System.out.println(root.getValue());
		rightTopView(root.getRightNode());
       
	}
	
	public static void leftTopView(TreeNode node){
		if(node == null){
			return;
		}
		
		leftTopView(node.getLeftNode());
		System.out.println(node.getValue());
		
	}
	
	public static void rightTopView(TreeNode node){
		if(node == null){
			return;
		}
		
		System.out.println(node.getValue());
		rightTopView(node.getRightNode());
		
		
	}

}

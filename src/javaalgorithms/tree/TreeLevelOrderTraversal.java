package javaalgorithms.tree;

import java.util.Queue;

import javaalgorithms.TreeNode;

import java.util.LinkedList;

public class TreeLevelOrderTraversal {

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
		
		levelOrderTraversal(root);

	}
	
	public static void levelOrderTraversal(TreeNode node){
		if(node == null){
			return;
		}
		
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
		
		
		nodeQueue.offer(node);
		
		while(!nodeQueue.isEmpty()){
			TreeNode n = nodeQueue.poll();
			System.out.println(n.getValue());
			
			if(n.getLeftNode() != null){
				nodeQueue.add(n.getLeftNode());				
			}
			
			if(n.getRightNode() != null){
				nodeQueue.add(n.getRightNode());
			}
		}
		
		
	}

}

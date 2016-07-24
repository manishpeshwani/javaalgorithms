package javaalgorithms;

public class BinaryTree<T> {
	
	private TreeNode<T> root;//Root node
	
	public BinaryTree(){
		root = null;
	}
	
	public void add(int value){
		TreeNode<T> newNode = new TreeNode<T>(value);
		
		if(root == null){
			root = newNode;
		}else {
			TreeNode<T> current = root;
			
			while(true){
				TreeNode parent = current;
				
				if(value < current.getValue()){
					current = current.getLeftNode();
					if(current == null){
						parent.setLeftNode(newNode);
						return;
					}
				}else{
					current = current.getRightNode();
					if(current == null){
						parent.setRightNode(newNode);
						return;
					}
					
				}
			}
		}
		System.out.println(root);
	}
	
	public TreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<T> root) {
		this.root = root;
	}

	public void inOrder(TreeNode root, int level){
		if(root == null){
			return;
		}
		level++;
		inOrder(root.getLeftNode(), level);
		System.out.println("Level:" + level);
		System.out.println("Value:" + root.getValue());
		inOrder(root.getRightNode(),level);
	}
	
	public void preOrder(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.getValue());
		preOrder(root.getLeftNode());
		preOrder(root.getRightNode());
	}
	
	public void postOrder(TreeNode root){
		if(root == null){
			return;
		}
		
		preOrder(root.getLeftNode());
		preOrder(root.getRightNode());
		System.out.println(root.getValue());
	}
	
	public void find(int value){
		TreeNode current = root;
		
		while(current != null){
			if(current.getValue() == value){
				System.out.println("Found");
				return;
			}else if(value < current.getValue()){
				current = current.getLeftNode();
			}else{
				current = current.getRightNode();
			}
		}
		
		System.out.println("Not Found");
		
	}
	
	public int minimum(){
		TreeNode current = root;
		if(current == null){
			throw new RuntimeException();
		}
		while(current.getLeftNode() != null){
			current = current.getLeftNode();
		}
		System.out.println("Minimum value in the tree is : " + current.getValue());
		return current.getValue();
	}
	
	public int maximum(){
		TreeNode current = root;
		if(current == null){
			throw new RuntimeException();
		}
		while(current.getRightNode() != null){
			current = current.getRightNode();
		}
		System.out.println("Maximum value in the tree is : " + current.getValue());
		return current.getValue();
	}
	
	public void printBottom(TreeNode topNode){
		TreeNode current = topNode;
		if(current == null){
			return;
		}
		
		if(current.getLeftNode() == null && current.getRightNode() == null){
			System.out.println(current.getValue());
		}
		printBottom(current.getLeftNode());
		printBottom(current.getRightNode());
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.add(20);
		tree.add(8);
		tree.add(22);
		tree.add(5);
		tree.add(3);
		tree.add(4);
		tree.add(25);
		tree.add(10);
		tree.add(14);
		
		tree.find(25);
		tree.minimum();
		
		tree.maximum();
		
		tree.inOrder(tree.getRoot(),0);
		System.out.println(" Pre Order " );
		tree.preOrder(tree.getRoot());
		
		System.out.println(" Post Order " );
		tree.postOrder(tree.getRoot());
		
		System.out.println(" Printing Bottom:" );
		tree.printBottom(tree.getRoot());
	}
}

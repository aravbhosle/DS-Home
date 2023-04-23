package structures;

public class FIFOFILO {
	public static void main(String[] args) {
		BinaryTreeNode n1 = new BinaryTreeNode(50);
		BinaryTreeNode n2 = new BinaryTreeNode(25);
		BinaryTreeNode n3 = new BinaryTreeNode(75);
		BinaryTreeNode n4 = new BinaryTreeNode(13);
		BinaryTreeNode n5 = new BinaryTreeNode(37);
		BinaryTreeNode n6 = new BinaryTreeNode(63);
		BinaryTreeNode n7 = new BinaryTreeNode(87);
		
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		
		BinaryTreeNode.print(n1);
	}
	
	
}

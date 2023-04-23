package structures;

public class BinaryTreeNode {
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	private int val;
	
	public BinaryTreeNode(int x) {
		this.val = x;
	}
	public void insert(int num, BinaryTreeNode root) {
		if(num >= root.val) {
			if(root.right == null) {
				root.right.val = num;
			} else {
				insert(num, root.right);
			}
			
		} else {
			if(root.left == null) {
				root.left.val = num;
			} else {
				insert(num, root.left);
			}
		}
	}
	
	public boolean find(int num, BinaryTreeNode root) {
		if(num == root.val) {
			return true;
		} else if(num > root.val) {
			if(root.right != null) {
				find(num, root.right);
			} 
		} else {
			if(root.left != null) {
				find(num, root.left);
			}
		}
		return false;
	}
	
	public static void print(BinaryTreeNode root) {
		
		if(root.right != null) {
			BinaryTreeNode.print(root.right);
		}
		
		if(root.left != null) {
			BinaryTreeNode.print(root.left);
		}
		
		if(root.left == null && root.right == null) {
			System.out.println("Val: " + root + " is a leaf");
		} else {
			System.out.println("Val: "+ root + " Left: " + root.left + " Right: " + root.right);
		}
		
	}
	
	public void setLeft(BinaryTreeNode n) {
		this.left = n;
	}
	
	public void setRight(BinaryTreeNode n) {
		this.right= n;
	}
	
	public int getVal() {
		return this.val;
	}
	public void setVal(int num) {
		this.val = num;
	}
	
    public String toString() {
    	return Integer.toString(val);
    }

	
}

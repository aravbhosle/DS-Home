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
    
    public BinaryTreeNode delete(BinaryTreeNode n, int val) {
    	if(n == null) {
    		return null;
    	}
    	if(val < n.val) {
    		n.left = delete(n.left, val);
    	} else if (val > n.val) {
    		n.right = delete(n.right, val);
    	} else {
    		if(n.left == null || n.right == null) {
    			BinaryTreeNode temp = null;
    			temp = n.left == null ? n.right : n.left;
    			
    			if(temp == null) {
    				return null;
    			} else {
    				return n;
    			}
    		} else {
    			BinaryTreeNode successor = getSuccessor(n);
    			n.val = successor.val;
    			n.right = delete(n.right, successor.val);
    			return n;
    		}
    	}
    	return n;
    }
    
    public BinaryTreeNode getSuccessor(BinaryTreeNode n) {
    	if(n==null) {
    		return null;
    	}
    	
    	BinaryTreeNode temp = n.right;
    	
    	while(temp.left != null) {
    		temp = temp.left;
    	}
    	
    	return temp;
    }

	
}

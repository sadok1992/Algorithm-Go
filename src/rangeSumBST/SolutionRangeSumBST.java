package rangeSumBST;

import helperFunctions.GenericAssister;
import helperStructure.TreeNode;

public class SolutionRangeSumBST {
	
	/*
	 * Time complexity of this solution is O(n) where n number of nodes in the tree
	 * Space Complexity is O(h) where h is the height of the tree.
	 */
    public static int rangeSumBST(TreeNode root, int L, int R) {
    	if(root==null)
			return 0;
    	if(root.val>=L && root.val<=R)
    		return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
    	else if(root.val>R)
    		return rangeSumBST(root.left,L,R);
    	else 
    		return rangeSumBST(root.right,L,R);
    }	

	public static int sumBinarySearchTree(TreeNode root) {
		if(root==null)
			return 0;
		return root.val + sumBinarySearchTree(root.left) + sumBinarySearchTree(root.right);
	}
	
	public static void main(String[] args) {
		//root = [10,5,15,3,7,null,18], L = 7, R = 15
		TreeNode node5 = new TreeNode(5);
		node5.left = new TreeNode(3);
		node5.right = new TreeNode(7);
		
		TreeNode node15 = new TreeNode(15);
		node15.left = null;
		node15.right = new TreeNode(18);
		
		TreeNode root = new TreeNode(10);
		root.left = node5;
		root.right = node15;
		System.out.println("printing tree");
		GenericAssister.printTree(root);
		
		System.out.println("printing sum of tree");
		System.out.println(sumBinarySearchTree(root));
		
		System.out.println("printing sum in range");
		System.out.println(rangeSumBST(root,7,15));
		
	}
	
}

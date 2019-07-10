package mergeTwoBinaryTrees;

import helperFunctions.GenericAssister;
import helperStructure.TreeNode;

public class SolutionMergeTreeNode {

	/*
	 * Time complexity of this solution is O(n) where n the minimum  number of nodes between the two trees.
	 */
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) {
			return t2;
		}else if(t2 == null) {
			return t1;
		}else {
			t1.val+=t2.val;
			t1.left = mergeTrees(t1.left, t2.left);
			t1.right = mergeTrees(t1.right, t2.right);
			return t1;
		}
    }
	
	public static void main(String[] args) {
		TreeNode treeLeft1 = new TreeNode(3);
		treeLeft1.left = new TreeNode(5);
		TreeNode tree1 = new TreeNode(1);
		tree1.left = treeLeft1;
		tree1.right = new TreeNode(2);
		
		TreeNode treeLeft2 = new TreeNode(1);
		treeLeft2.right = new TreeNode(4);
		TreeNode treeRight2 = new TreeNode(3);
		treeRight2.right = new TreeNode(7);
		
		TreeNode tree2 = new TreeNode(2);
		tree2.left = treeLeft2;
		tree2.right = treeRight2;
		
		GenericAssister.printTree(mergeTrees(tree1, tree2));
		
		
		
		
		
	}
}

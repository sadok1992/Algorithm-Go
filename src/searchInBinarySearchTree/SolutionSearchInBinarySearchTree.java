package searchInBinarySearchTree;

import helperFunctions.GenericAssister;
import helperStructure.TreeNode;

public class SolutionSearchInBinarySearchTree {

	public static TreeNode searchBST(TreeNode root, int val) {
		if(root == null || root.val == val) {
			return root;
		}else if(root.val>val) {
			return searchBST(root.left, val);
		}else {
			return searchBST(root.right, val);
		}
	}

	public static void main(String[] args) {
		// root = [10,5,15,3,7,null,18], L = 7, R = 15
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
		

		System.out.println("printing sum in range");
		System.out.println(searchBST(root, 7).val);

	}
}

package helperFunctions;

import helperStructure.TreeNode;

public class GenericAssister {
	
	private GenericAssister() {
		
	}
	
	public static void printMatrix(int[][]A) {
		System.out.print("[");
		for(int i=0;i<A.length;i++) {
			System.out.print("[");
			for(int j=0;j<A.length-1;j++) {
				System.out.print(A[i][j]+"|");
			}
			System.out.print(A[i][A.length-1]);
			System.out.print("]");
			
		}
		System.out.print("]");
	}
	
	public static void printArray(int[] A) {
		System.out.print("[");
		for (int i = 0; i < A.length - 1; i++) {
			System.out.print(A[i] + "|");
		}
		System.out.print(A[A.length - 1]);
		System.out.print("]");
	}
	
	public static void printTree(TreeNode root) {
		if (root != null) {
			System.out.println(root.val);
			printTree(root.left);
			printTree(root.right);
		}
	}

}

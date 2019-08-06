package preorderNArrayTree;

import java.util.ArrayList;
import java.util.List;

import helperStructure.NArrayTree;

public class SolutionNArrayTreePreOrder {

	 public List<Integer> preorder(NArrayTree root) {
	        List<Integer> result = new ArrayList<Integer>();
			constructList(root, result);
			return result;
	    }
	    public void constructList(NArrayTree root,List<Integer> list) {
			if(root!=null) {
	                list.add(root.val);
	                if(root.children.size()!=0) {
	                for(int i=0;i<root.children.size();i++) {
	                    constructList(root.children.get(i), list);
	                }
	            }
			}
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

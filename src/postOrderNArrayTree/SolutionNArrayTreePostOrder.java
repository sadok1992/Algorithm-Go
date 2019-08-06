package postOrderNArrayTree;

import java.util.ArrayList;
import java.util.List;

import helperStructure.NArrayTree;

public class SolutionNArrayTreePostOrder {
	
	 public List<Integer> postorder(NArrayTree root) { 
	        List<Integer> result = new ArrayList<Integer>();
			constructList(root, result);
			return result;
	    }
	    public void constructList(NArrayTree root,List<Integer> list) {
			if(root!=null) {
	                if(root.children.size()!=0) {
	                for(int i=0;i<root.children.size();i++) {
	                    constructList(root.children.get(i), list);
	                }
	            }
	            list.add(root.val);
			}
	    }
 }

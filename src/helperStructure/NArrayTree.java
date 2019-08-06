package helperStructure;

import java.util.List;

public class NArrayTree {

	public int val;
	public List<NArrayTree> children;

	public NArrayTree() {
	}

	public NArrayTree(int _val, List<NArrayTree> _children) {
		val = _val;
		children = _children;
	}

}

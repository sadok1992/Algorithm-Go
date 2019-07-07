package removeOuterParenthesesAfterDecompose;

import java.util.ArrayList;
import java.util.List;

public class SolutionRemoveOuterAfterDecompose {
	
	public static String removeOuterParentheses(String S) {
		List<StringBuffer> list = new ArrayList<>();
		int count = 0;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<S.length();i++) {
			sb.append(S.charAt(i));
			if(S.charAt(i)=='(') {
				count++;
			}else {
				count--;
			}
			if(count==0) {
				list.add(sb);
				sb = new StringBuffer();
			}
		}
		count = 0;
		StringBuffer result = new StringBuffer();
		for(int i=0;i<list.size();i++) {
			StringBuffer dsb = list.get(i);
			for(int j=0;j<dsb.length();j++) {
				if(dsb.charAt(j)=='(') {
					count++;
				}else {
					count--;
				}
				if(count==0) {
					dsb.deleteCharAt(j);
					dsb.deleteCharAt(0);
				}
			}
			result.append(dsb);
		}
		return result.toString();
    }

	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));

	}

}

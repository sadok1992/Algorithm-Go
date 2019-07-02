package removeOuterParentheses;

public class SolutionRemoveOuterParentheses {

	
	public static String removeOuterParentheses(String S) {
        StringBuffer result = new StringBuffer(S);
        boolean outerExist = true;
        while(outerExist) {
        	outerExist = false;
        	int start=0;
        	int i=0;
        	boolean innerExist = false;
        	int count = 0;
        	while(i<result.length()) {
        		if(result.charAt(i)=='(')
        			count++;
        		else
        			count--;
        		if(innerExist == false && count == 2) {
        			outerExist = true;
        			innerExist = true;
        			start = i-count+1;
        		}
        		if(innerExist && (count == 0)) {
        			result.deleteCharAt(i);
        			result.deleteCharAt(start);
        			innerExist = false;
        			i=i-2;
        		}
        		i++;
        	}
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));

	}

}

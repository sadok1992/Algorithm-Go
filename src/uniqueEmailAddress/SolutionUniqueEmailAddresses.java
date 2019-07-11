package uniqueEmailAddress;

import java.util.HashMap;
import java.util.Map;

public class SolutionUniqueEmailAddresses {

	/*
	 * Time complexity of this solution is O(nm) where n is size of the array and m is size of the email.
	 */
	public static int numUniqueEmails(String[] emails) {
	        Map<String,Integer> mapEmails = new HashMap<>();
	        int uniqueEmailCount = 0;
	        for(int i=0; i<emails.length; i++) {
	        	String email = emails[i];
	        	StringBuilder uniformEmail = new StringBuilder();
	        	boolean isDomail = false;
	        	boolean ignore = false;
	        	for(int j=0;j<email.length();j++) {
	        		if(isDomail) {
	        			uniformEmail.append(email.charAt(j));
	        		}else if(!ignore) {
	        			if(email.charAt(j)=='+') {
	        				ignore = true;
	        			}else if(email.charAt(j)!='.') {
	        				uniformEmail.append(email.charAt(j));
	        			}
	        		}
	        		if(email.charAt(j)=='@') {
    					isDomail = true;
    					if(ignore == true) {
    						uniformEmail.append(email.charAt(j));
    					}
        			}
	        	}
	        	if(!mapEmails.containsKey(uniformEmail.toString())) {
	        		mapEmails.put(uniformEmail.toString(), 1);
	        		uniqueEmailCount++;
	        	}
	        }
	        return uniqueEmailCount;
	}
	 
	public static void main(String[] args) {
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
	}

}

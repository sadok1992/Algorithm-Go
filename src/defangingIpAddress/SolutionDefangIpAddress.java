package defangingIpAddress;

public class SolutionDefangIpAddress {
	
	public static String defangIPaddr(String address) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				sb.append("[.]");
			}else {
				sb.append(address.charAt(i));
			}
		}
		return sb.toString();
	        
	}

	public static void main(String[] args) {
		String address = "255.100.50.0";
		
		System.out.println(defangIPaddr(address));

	}

}

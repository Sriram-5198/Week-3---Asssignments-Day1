package assignment5_string;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
	    char[] cr = s.toCharArray();
		String rev= "";
		int length = cr.length;
		
		for (int i = length-1; i >=0 ; i--) {
			rev=rev+cr[i];
		}
//		System.out.println(rev);
			if (s.equals(rev)) {
				System.out.println("The given string "+ rev +" is palindrome");
			} else {
                System.out.println("The given string "+ rev +" is not a palindrome");
			}
			
		}

	

}

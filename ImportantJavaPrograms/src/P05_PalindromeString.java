
public class P05_PalindromeString {

	public static void main(String[] args) {
		// Palindrome STring is a String thats remains same after it Reverse
		//First we will reverse the String and Then Compare it
		
		String str="madam";
		String origional_string=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
				
		//System.out.println(rev);		
		if(origional_string.equals(rev)) {
			System.out.println("Given String is Palindrome");
		}
		
		else{
			System.out.println("Given String is Not Palindrome");
		}

	}

}

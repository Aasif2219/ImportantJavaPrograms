
public class P03_ReverseString {

	public static void main(String[] args) {
		
	String str="Aasif Shaikh";
	
	//1. By using for loop
/*	String rev=" ";

	for(int i=0;i<str.length();i++) {
		
		rev=str.charAt(i)+rev;
		
	}
	System.out.println(rev);  

	//2. By Using StringBuffer
	 StringBuffer sf = new StringBuffer(str);
	 StringBuffer rev=sf.reverse();
	 System.out.println(rev);  */
	
	
	//3. By using StringBuilder
	StringBuilder sb= new StringBuilder();
	sb.append(str);
	StringBuilder rev=sb.reverse();
	
	System.out.println(rev);
	System.out.println(str.length());
	System.out.println(str.replace(" ", ""));
	
	
	}

}

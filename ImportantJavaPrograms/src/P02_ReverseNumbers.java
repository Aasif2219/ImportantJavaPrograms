
public class P02_ReverseNumbers {

	public static void main(String[] args) {

     int num=1234;
     
     //Method 01 - Normal method
    /* int rev=0;
     
     while(num!=0) {
    	 
    	 rev=rev*10+num%10;
    	 num=num/10;
    	 
     }
     System.out.println(rev);  

     //Method 02 - Using StringBuilder
     StringBuilder str= new StringBuilder();
     str.append(num);
     StringBuilder rev1=str.reverse();
     System.out.println(rev1); */
     
     //Method 03 - Using StringBuffer
     StringBuffer sb= new StringBuffer(String.valueOf(num));
     StringBuffer rev=sb.reverse();
     System.out.println(rev);
     
	}

}

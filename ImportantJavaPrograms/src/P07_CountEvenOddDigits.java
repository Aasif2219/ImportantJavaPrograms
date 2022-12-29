
public class P07_CountEvenOddDigits {

	public static void main(String[] args) {
		
		int num=123457;
		int Even_count=0;
	    int odd_count=0;
	    
	    while(num!=0) {
	     
	    	int rem=num%10;  //Extract last digit
	    	
	    	if(rem%2==0) {
	    		Even_count++;	
	    	}
	    	
	    	else {
	    		odd_count++;
	    	}
	    	
	    	num=num/10;   //Eliminate last digit
	    	
	    }
		 
	    System.out.println("In Given Number "+Even_count +" Even and " +odd_count+" odd Number");
		
		}

	}


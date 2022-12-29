
public class P08_SumOfDigitsInANumber {

	public static void main(String[] args) {

     int num=12345;
     
     int sum=0;
     
     while(num!=0) {
    	 int rem=num%10;
    	 sum=sum+rem;
    	 num=num/10;
     }
		System.out.println("sum of Digits in a given number is: "+sum);

	}

}

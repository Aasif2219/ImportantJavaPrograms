
public class P01_SwapTwoNumbers {

	public static void main(String[] args) {
		 
		int a=10,b=20;
		 
		System.out.println("Origional Number is "+a +" "+ +b);
		
		//Method01 - Swap with using 3rd Variable
	/*	int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping Number is "+a +" " +b); */
	   
		//Method02 - Swap without using 3rd Variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping Number is "+a +" " +b);

	}

}

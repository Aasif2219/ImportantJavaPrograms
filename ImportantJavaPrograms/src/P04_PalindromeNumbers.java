import java.util.Scanner;

public class P04_PalindromeNumbers {

	public static void main(String[] args) {
		// A Palindrome Number is a Number which is remains same while it's digits are Reversed. e.g 16461
		// For that Firstly we are reversing the number and then compare Original number and reversed Number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int original_num=num;
		int rev=0;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
				
		}
		
		System.out.println("Number After Reversed "+rev);
		
		if(original_num==rev) {
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is Not Palindrome");
		}

	}

}

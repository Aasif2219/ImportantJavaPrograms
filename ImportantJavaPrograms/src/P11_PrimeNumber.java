
public class P11_PrimeNumber {

	public static void main(String[] args) {
    // Prime Number is Greater that 1
	// Prime Number is divisible by 1 and itself only - it means its two factorial 1 and itself
	int num=3; 
	int count=0;
	
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is Not a Prime Number");
		}
		
	}
	else {
		System.out.println(num+" is Not a Prime Number");
	}
		
	}

}

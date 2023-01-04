
public class P14_OddEvenNumbers {

	public static void main(String[] args) {

    int [] a = {3,5,2,7,9,8};
    
    System.out.println("Even Number is ");
    for(int i=0;i<a.length;i++) {	
    if(a[i]%2==0)
    System.out.println(a[i]);
    }
    
    System.out.println("Odd Number is ");
    for(int i=0;i<a.length;i++) {	
    if(a[i]%2!=0)
    System.out.println(a[i]);
    }

	}

}

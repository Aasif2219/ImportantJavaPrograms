
public class P15_SumOfArray {

	public static void main(String[] args) {
		
		int [] a = {3,5,2,7,9,8};
		int sum=0;
		
		//Method01
/*		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
     System.out.println("Sum of Element in Array is: "+sum); */
     
   //Method02
     for(int value:a) {
    	 sum=sum+value;
     }
     System.out.println("Sum of Element in Array is: " +sum);
	}

}

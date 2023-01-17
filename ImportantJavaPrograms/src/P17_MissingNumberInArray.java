
public class P17_MissingNumberInArray {

	public static void main(String[] args) {
   
	//Array should not have duplicate Element
	//Only one number is missing	
	//Value should in range
    int [] a = {1,4,7,2,3,5};
    int sum=0;  //Sum of Element present in array
    int sum1=0; //Sum of Range of Element in between Array (In Above example range is 1 to 7) 
    
    for(int i=0;i<a.length;i++) {
    	sum=sum+a[i];
    }
 //   System.out.println(sum);
    
    for(int i=0;i<=7;i++) {
    	sum1=sum1+i;
    }
  //  System.out.println(sum1);
    
    System.out.println("Missing Number in Array is "+(sum1-sum));

	}

}

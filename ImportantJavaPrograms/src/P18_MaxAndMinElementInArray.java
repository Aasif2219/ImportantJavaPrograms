
public class P18_MaxAndMinElementInArray {

	public static void main(String[] args) {

     int [] a= {20,30,100,40,50};
     int max=a[0];
     int min=a[0];
     for(int i=1;i<a.length;i++) {
    	 
    	 if(a[i]>max)
    		 max=a[i];
    	 
    	 if(a[i]<min)
    		 min=a[i];
     }
     System.out.println("Maximum Element in Array is: "+max);
     System.out.println("Minimum Element in Array is: "+min);

	}

}

import java.util.Arrays;
import java.util.Collections;

public class P22_SortElementBuildInMethod {

	public static void main(String[] args) {

     int [] a = {5,8,1,4,7};
     System.out.println("Array Before sorting "+Arrays.toString(a));
     
     //Approach 01
/*    for(int i=0;i<a.length-1;i++) {
    	 
    	 for(int j=i+1;j<a.length;j++)
    		 
    	 if(a[i]>a[j]) {
    		 
    		 int temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    	 } 
     }
     */
    
     //Approach 02
     Arrays.sort(a);
     System.out.println("Array After sorting "+Arrays.toString(a));
     
     
	}

}

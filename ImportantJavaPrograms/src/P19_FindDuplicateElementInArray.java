import java.util.HashSet;

public class P19_FindDuplicateElementInArray {

	public static void main(String[] args) {

    String [] a = {"Java","C","C++","Python","Java","C"};
      boolean flag=false;
      
     //Approach 1
/*    for(int i=0;i<a.length;i++) {
    	for(int j=i+1;j<a.length;j++) {
    		
    		if(a[i]==a[j]) {
    		System.out.println("Duplicate Element is: "+a[i]);
    		flag=true;
    		}
    	}
    }
    
     if(flag==false) {
    	 System.out.println("Duplicate Element Not Found");
     } */
      
     //Approach 2
     HashSet<String> lang = new <String> HashSet();
     
     for(String l:a) {
    	 
    	 if(lang.add(l)==false) {
    	 System.out.println("Duplicate Element is: "+l);
     	 flag=true;
    	 } 
     }
     if(flag==false) {
    	 System.out.println("Duplicate Element Not Found");
     } 
	}
}

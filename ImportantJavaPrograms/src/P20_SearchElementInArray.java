
public class P20_SearchElementInArray {

	public static void main(String[] args) {
		// Linear Search
		int [] a = {20,50,10,43,65};
		int ele = 65;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			
			if(ele==a[i]) {
				System.out.println("Element found at "+i);
				flag=true;
				break;
				}
			}
		    if(flag==false) {
			System.out.println("Element Not Found");
		    }
	}

}
